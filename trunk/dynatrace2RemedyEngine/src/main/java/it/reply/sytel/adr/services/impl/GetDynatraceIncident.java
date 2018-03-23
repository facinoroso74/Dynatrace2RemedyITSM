package it.reply.sytel.adr.services.impl;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;

import it.reply.sytel.adr.constants.ADRConstants;
import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;
import it.reply.sytel.adr.core.services.service.AbstractService;
import it.reply.sytel.adr.dao.IncidentDAO;
import it.reply.sytel.adr.domain.Dashboard;
import it.reply.sytel.adr.dynatraceClient.DynatraceClient;
import it.reply.sytel.adr.services.exc.GetDynatraceIncidentException;
import it.reply.sytel.adr.vo.DynatraceIncident;
import it.reply.sytel.adr.vo.DynatraceIncidentKey;

public class GetDynatraceIncident extends AbstractService {

	private IncidentDAO incidentDAO;
	private DynatraceClient dynatraceClient;
	
	
	public GetDynatraceIncident() {
		super(GetDynatraceIncident.class.getName());
		log = LogManager.getLogger(getClass());
	}
	
	@Override
	protected Enviromnent perform(Enviromnent env) {

		try {
			Timestamp now = new Timestamp(System.currentTimeMillis());
			
			Map<String , Object> configMap = (Map<String , Object>)getContext().getConfigMap();
			Iterable<Dashboard> dashboardconfigList = (Iterable<Dashboard>)configMap.get(ADRConstants.DASH_BOARD_CONFIG_LIST);
			
			for (Dashboard dashboard : dashboardconfigList) {
				
				if(log.isDebugEnabled()) {
					log.debug("the Name for app:["+dashboard.getName()+"]");
					log.debug("the URL for app:["+dashboard.getAppUrl()+"]");
					log.debug("the USR for app:["+dashboard.getAppUser()+"]");
					log.debug("the PWD for app:["+dashboard.getAppPwd()+"]");
				}
				
				Map<DynatraceIncidentKey, DynatraceIncident> map= dynatraceClient.getDynatraceIncidents(dashboard.getName(),dashboard.getAppUrl(),dashboard.getAppUser(),dashboard.getAppPwd());
				
				Set<DynatraceIncidentKey> dynatraceIncidentKeys = map.keySet();
				
				for (Iterator<DynatraceIncidentKey> iterator2 = dynatraceIncidentKeys.iterator(); iterator2.hasNext();) {
					
					DynatraceIncidentKey dynatraceIncidentKey = (DynatraceIncidentKey) iterator2.next();
					if( !incidentDAO.alreadyExistsDynatraceIncident(dynatraceIncidentKey) ) {
						DynatraceIncident dynatraceIncident = map.get(dynatraceIncidentKey);
						dynatraceIncident.setDataIns(now);
						dynatraceIncident.setDataUpdate(now);
						incidentDAO.insertDynatraceIncident(dynatraceIncident);
						log.debug("Incident inserted:["+dynatraceIncidentKey+"");
					}else {
						log.debug("Incident alreay Exists:["+dynatraceIncidentKey+"] update the DateUpdate");
						incidentDAO.updateDynatraceIncidentDateUpdate(dynatraceIncidentKey,now);
					}
				}
			}
			
			env.put(ADRConstants.SYSDATE, now);
			return env;
		
		} catch (Exception e) {
			throw new GetDynatraceIncidentException("Exception on GetDynatraceIncident", e);
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

