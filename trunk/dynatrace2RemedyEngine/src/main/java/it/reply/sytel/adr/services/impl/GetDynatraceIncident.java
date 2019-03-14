package it.reply.sytel.adr.services.impl;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;

import it.reply.sytel.adr.constants.ADRConstants;
import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;
import it.reply.sytel.adr.core.services.service.AbstractService;
import it.reply.sytel.adr.dao.IncidentDAO;
import it.reply.sytel.adr.domain.Configuration;
import it.reply.sytel.adr.domain.Dashboard;
import it.reply.sytel.adr.dynatraceClient.DynatraceClient;
import it.reply.sytel.adr.repositories.ConfigurationRepository;
import it.reply.sytel.adr.repositories.DashboardRepository;
import it.reply.sytel.adr.services.exc.GetDynatraceIncidentException;
import it.reply.sytel.adr.utility.ADRUtility;
import it.reply.sytel.adr.vo.DynatraceIncident;
import it.reply.sytel.adr.vo.DynatraceIncidentKey;

public class GetDynatraceIncident extends AbstractService {

	private IncidentDAO incidentDAO;
	private DynatraceClient dynatraceClient;
	
	@Autowired
	private DashboardRepository dashboardRepository;
	
	public GetDynatraceIncident() {
		super(GetDynatraceIncident.class.getName());
		log = LogManager.getLogger(getClass());
	}
	
	@Autowired
    private ConfigurationRepository configurationRepository; 
    
	@Override
	protected Enviromnent perform(Enviromnent env) {

		try {
			Timestamp now = new Timestamp(System.currentTimeMillis());
			
			Map<String , Object> configMap = (Map<String , Object>)getContext().getConfigMap();
			//Iterable<Dashboard> dashboardconfigList = (Iterable<Dashboard>)configMap.get(ADRConstants.DASH_BOARD_CONFIG_LIST);
			Iterable<Dashboard> dashboardconfigList = dashboardRepository.findAll();
			
			log.info("Number of DashBoard to call:["+((List<Dashboard>)dashboardconfigList).size()+"]");
			
			for (Dashboard dashboard : dashboardconfigList) {
				
				if(log.isDebugEnabled()) {
					log.debug("the Name for app:["+dashboard.getName()+"]");
					log.debug("the URL for app:["+dashboard.getAppUrl()+"]");
					log.debug("the USR for app:["+dashboard.getAppUser()+"]");
					log.debug("the PWD for app:["+dashboard.getAppPwd()+"]");
				}
				
				Map<DynatraceIncidentKey, DynatraceIncident> map= dynatraceClient.getDynatraceIncidents(dashboard.getName(),dashboard.getAppUrl(),dashboard.getAppUser(),dashboard.getAppPwd());
				
				log.info("--------------There are [" + map.keySet().size()+"] incident to work------------");
				
				if(log.isDebugEnabled()) {
					log.debug("--------------------------------INCIDENTS--------------------------------------------");
					Set<DynatraceIncidentKey> keys = map.keySet();
					for (Iterator<DynatraceIncidentKey> iterator = keys.iterator(); iterator.hasNext();) {
						DynatraceIncidentKey dynatraceIncidentKey = (DynatraceIncidentKey) iterator.next();
						log.debug("Incident:["+map.get(dynatraceIncidentKey)+"]");
					}
					log.debug("-------------------------------------------------------------------------------------");
				}
					
				Set<DynatraceIncidentKey> dynatraceIncidentKeys = map.keySet();
				
				int i=0;
				
				for (Iterator<DynatraceIncidentKey> iterator2 = dynatraceIncidentKeys.iterator(); iterator2.hasNext();) {

					DynatraceIncidentKey dynatraceIncidentKey = (DynatraceIncidentKey) iterator2.next();
					
					if(insertIntoDB(dynatraceIncidentKey, now, map,dashboard.getName()))
						i++;
				}
				
				log.info("Incident inserted nunmber:["+i+"]");
			}
			
			env.put(ADRConstants.SYSDATE, now);
			return env;
		
		} catch (Exception e) {
			throw new GetDynatraceIncidentException("Exception on GetDynatraceIncident", e);
		}
	}
	
	private boolean insertIntoDB(DynatraceIncidentKey dynatraceIncidentKey,Timestamp now,Map<DynatraceIncidentKey, DynatraceIncident> map,String dashBoard) {

		DynatraceIncident dynatraceIncident = map.get(dynatraceIncidentKey);
		
		//check if the ticket not exists and the dynatarceIncident endDate is null
		if( !incidentDAO.alreadyExistsDynatraceIncident(dynatraceIncidentKey)){ 

			if(dynatraceIncident.getEndEvent()==null) {
						
				//I have to store only the incident for who there is a configuration
				log.debug("dynatraceIncident.getIncidentType():["+dynatraceIncident.getIncidentType()+"]");
				String descrizioneToFind=ADRUtility.getDescrizioneFromIncidentType(dynatraceIncident.getIncidentType());
				log.debug("descrizioneToFind:["+descrizioneToFind+"] for DashBoard:["+dashBoard+"]");
				
				Configuration configuration = configurationRepository.findByDescrizioneAndDashboard(descrizioneToFind, dashBoard);
				
				if(configuration==null) {
					log.info("Dynatrace Event "+descrizioneToFind+" not configurated on DB for the DashBoard:["+dashBoard+"]");
					return false;
				}
				
				log.info("There is a configuration for Dynatrace Event "+descrizioneToFind+" and the DashBoard:["+dashBoard+"]");
				dynatraceIncident.setDataIns(now);
				dynatraceIncident.setDataUpdate(now);
				incidentDAO.insertDynatraceIncident(dynatraceIncident);
				log.info("Incident inserted:["+dynatraceIncidentKey+"");
				return true;
			}
			return false;
		}else {
			
			//If the incident exists and the endDate is not null, then I have to perform the update it
			//if into the table is null
			if(dynatraceIncident.getEndEvent()!=null) {
				if(incidentDAO.isDynatraceIncidentWithTicketIDAndStatusNewWithoutEndDate(dynatraceIncidentKey)) {
					incidentDAO.updateDynatraceIncidentEndDateUpdate(dynatraceIncident);
					log.debug("Incident :["+dynatraceIncidentKey+" updated with endDate:["+dynatraceIncident.getEndEvent()+"]");
				}else
					log.debug("The Dynatrace Incident:["+dynatraceIncidentKey+"] is not updated because the remedyTicketId is null or the Status is not New or the EndDate is not null");
			}
			
			log.info("Incident already exists:["+dynatraceIncidentKey+"] update the DateUpdate");
			incidentDAO.updateDynatraceIncidentDateUpdate(dynatraceIncidentKey,now);
			return false;
		}
		
	}

	public IncidentDAO getIncidentDAO() {
		return incidentDAO;
	}

	public void setIncidentDAO(IncidentDAO incidentDAO) {
		this.incidentDAO = incidentDAO;
	}


	public DynatraceClient getDynatraceClient() {
		return dynatraceClient;
	}

	public void setDynatraceClient(DynatraceClient dynatraceClient) {
		this.dynatraceClient = dynatraceClient;
	}

//	private DynatraceIncident buildDynatraceMock() {
//		
//		String name="prova";
//		
//		DynatraceIncident dynatraceIncident = new DynatraceIncident();
//		
//		DynatraceIncidentKey dynatraceIncidentKey = new DynatraceIncidentKey();
//		dynatraceIncidentKey.setName(name);
//		dynatraceIncidentKey.setStartEvent(new Timestamp(System.currentTimeMillis()));
//		dynatraceIncident.setDynatraceIncidentKey(dynatraceIncidentKey);
//		
//		Timestamp now = new Timestamp(System.currentTimeMillis());
//		dynatraceIncident.setDataIns(now);
//		dynatraceIncident.setDataUpdate(now);
//		
//		return dynatraceIncident;
//	}

	
}

