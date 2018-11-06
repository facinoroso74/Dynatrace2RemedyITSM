package it.reply.sytel.adr.services.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;

import it.reply.sytel.adr.constants.ADRConstants;
import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;
import it.reply.sytel.adr.core.services.service.AbstractService;
import it.reply.sytel.adr.dao.IncidentDAO;
import it.reply.sytel.adr.domain.Configuration;
import it.reply.sytel.adr.domain.RemedyConfiguration;
import it.reply.sytel.adr.remedyAdapter.RemedyClient;
import it.reply.sytel.adr.remedyAdapter.exc.RemedyBadValueFieldException;
import it.reply.sytel.adr.repositories.ConfigurationRepository;
import it.reply.sytel.adr.repositories.RemedyConfigurationRepository;
import it.reply.sytel.adr.services.exc.CreateRemedyIncidentException;
import it.reply.sytel.adr.services.exc.IncidentTypeConfigurationException;
import it.reply.sytel.adr.utility.ADRUtility;
import it.reply.sytel.adr.vo.DynatraceIncident;

public class CreateRemedyIncident extends AbstractService {

	@Autowired
    private ConfigurationRepository configurationRepository; 
	
	@Autowired
    private RemedyConfigurationRepository remedyConfigurationRepository;
	
	private IncidentDAO incidentDAO;
	private RemedyClient remedyClient;
	
	public CreateRemedyIncident() {
		super(CreateRemedyIncident.class.getName());
		log = LogManager.getLogger(getClass());

	}
	
	
	
	@Override
	protected Enviromnent perform(Enviromnent env) {

		try {
			
			Iterable<RemedyConfiguration> remedyCondifugrationIterable = remedyConfigurationRepository.findAll();
			
			
			//Map<String , Object> configMap = (Map<String , Object>)getContext().getConfigMap();
			//HashMap< String, List<Configuration>> mapIncidentConfiguration = (HashMap< String, List<Configuration>>)configMap.get(ADRConstants.INCIDENT_CONFIGURATION_CONFIG_MAP);
			
			//log.debug("Getting the RemedyConfiguration for [" + ((List<RemedyConfiguration>)configMap.get(ADRConstants.REMEDY_CONFIGURATION)).get(0) + "]");
			
			RemedyConfiguration remedyConfiguration = ((List<RemedyConfiguration>)remedyCondifugrationIterable).get(0);
			
			if(remedyConfiguration==null)
				throw new RemedyBadValueFieldException("The RemedyConfiguration is NULL. Please set the configuration for ITSM Remedy");
				
			List<DynatraceIncident> dynatraceIncidentList = incidentDAO.getDynatraceIncidentWithoutRemedyTicketID();
			
			
			log.info("Number of incident to create on Remedy:["+dynatraceIncidentList.size()+"]");
			
			for (Iterator<DynatraceIncident> iterator = dynatraceIncidentList.iterator(); iterator.hasNext();) {
				DynatraceIncident dynatraceIncident = (DynatraceIncident) iterator.next();
				
				createTicketRemedy(dynatraceIncident, remedyConfiguration);
			}
			return env;

		
		} catch (Exception e) {
			throw new CreateRemedyIncidentException("Exception on CreateRemedyIncident", e);
		}
	}
	
//	private boolean checkConfiguration(DynatraceIncident dynatraceIncident,Configuration configuration) {
//		try {
//			if(log.isDebugEnabled())
//				log.debug("checking for dynatraceIncident["+dynatraceIncident.getDynatraceIncidentKey().getName()+"] into configuration:["+configuration+"]");
//			return (dynatraceIncident.getDynatraceIncidentKey().getName().indexOf(configuration.getDescrizione()) != -1);
//		}catch (Exception e) {
//			throw new IncidentTypeConfigurationException("There is an error on checking the dynatraceIncident:["+dynatraceIncident+"] configuration:["+configuration+"]",e);
//		}
//	}
	
//	private Configuration getConfigurationByIncidentType(DynatraceIncident dynatraceIncident,List<Configuration> incidentConfigurationList) {
//				
//		for (Iterator<Configuration> iterator = incidentConfigurationList.iterator(); iterator.hasNext();) {
//			Configuration configuration = (Configuration) iterator.next();
//			if(checkConfiguration(dynatraceIncident,configuration))
//				return configuration;
//		}
//		log.info("There isn't any configuration for incidentType:["+dynatraceIncident.getIncidentType()+"]");
//		return null;
//	}

	private Configuration getConfigurationByIncidentType(DynatraceIncident dynatraceIncident) {
		log.debug("DynatraceIncident:["+dynatraceIncident+"]");
		String descrizioneToFind=ADRUtility.getDescrizioneFromIncidentType(dynatraceIncident.getIncidentType());
		log.debug("DescrizioneToFind:["+descrizioneToFind+"] for DashBoard:["+dynatraceIncident.getDynatraceIncidentKey().getDashboarName()+"]");
		
		Configuration configuration = configurationRepository.findByDescrizioneAndDashboard(descrizioneToFind, dynatraceIncident.getDynatraceIncidentKey().getDashboarName());
		if(configuration==null)
			log.info("There isn't any configuration for incidentType:["+descrizioneToFind+"]");
		return configuration;
	}
	
	private void createTicketRemedy(DynatraceIncident dynatraceIncident,RemedyConfiguration remedyConfiguration) {
		//create incident
		//Configuration incidentTypeConfiguration = getConfigurationByIncidentType(dynatraceIncident,incidentConfigurationList);
		
		Configuration incidentTypeConfiguration = getConfigurationByIncidentType(dynatraceIncident);
		
		if(incidentTypeConfiguration!=null) {
				
			try {
				String remedyIncidentId = remedyClient.createIncident( dynatraceIncident,remedyConfiguration,incidentTypeConfiguration);
		
				Timestamp now = new Timestamp(System.currentTimeMillis());
				dynatraceIncident.setRemedyTicketCreateDate(now);
				dynatraceIncident.setRemedyTicketID(remedyIncidentId);
				dynatraceIncident.setRemedyTicketIDStatus(remedyConfiguration.getStatus());
				
				if(log.isDebugEnabled())
					log.debug("Response from Remedy ----> remedyIncidentId:["+remedyIncidentId+"]");
				
				//posso creare un colonna RemedyStatus valorizzato a ERROR in caso di eccezione 
				incidentDAO.updateDynatraceIncidentAfterRemedyCall(dynatraceIncident);
				
			}catch (Exception e) {
				log.error("Exception on creating the RemedyTicket. dynatraceIncident:["+dynatraceIncident+"] remedyCponfiguration:["+remedyConfiguration+"]",e);
				incidentDAO.updateDynatraceIncidentCallWithStatusWithError(dynatraceIncident);
				
			}
		}
		
	}
	
	
	public IncidentDAO getIncidentDAO() {
		return incidentDAO;
	}

	public void setIncidentDAO(IncidentDAO incidentDAO) {
		this.incidentDAO = incidentDAO;
	}

	public RemedyClient getRemedyClient() {
		return remedyClient;
	}

	public void setRemedyClient(RemedyClient remedyClient) {
		this.remedyClient = remedyClient;
	}
	
}

