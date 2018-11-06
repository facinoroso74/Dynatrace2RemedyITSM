package it.reply.sytel.adr.services.impl;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;

import hpdIncidentInterfaceWS.HelpDeskQueryServiceResponseDocument;
import it.reply.sytel.adr.constants.ADRConstants;
import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;
import it.reply.sytel.adr.core.services.service.AbstractService;
import it.reply.sytel.adr.dao.IncidentDAO;
import it.reply.sytel.adr.domain.RemedyConfiguration;
import it.reply.sytel.adr.remedyAdapter.RemedyClientToClose;
import it.reply.sytel.adr.remedyAdapter.exc.RemedyBadValueFieldException;
import it.reply.sytel.adr.repositories.RemedyConfigurationRepository;
import it.reply.sytel.adr.services.exc.CloseRemedyIncidentException;
import it.reply.sytel.adr.vo.DynatraceIncident;

public class CloseRemedyIncident extends AbstractService {

	private IncidentDAO incidentDAO;
	private RemedyClientToClose remedyClient;
	
	@Autowired
    private RemedyConfigurationRepository remedyConfigurationRepository;
	
	
	public CloseRemedyIncident() {
		super(CloseRemedyIncident.class.getName());
		log = LogManager.getLogger(getClass());

	}
	

	@Override
	protected Enviromnent perform(Enviromnent env) {

		try {
			Timestamp now = (Timestamp)env.get(ADRConstants.SYSDATE);
			
			Iterable<RemedyConfiguration> remedyCondifugrationIterable = remedyConfigurationRepository.findAll();
			RemedyConfiguration remedyConfiguration = ((List<RemedyConfiguration>)remedyCondifugrationIterable).get(0);
			
			if(remedyConfiguration==null)
				throw new RemedyBadValueFieldException("The RemedyConfiguration is NULL. Please set the configuration for ITSM Remedy");
			
			
			List<DynatraceIncident> dynatraceIncidentList = incidentDAO.getDynatraceIncidentWithTicketIDAndStatusNewAndEndDate();			
			
			log.info("Number of incident to close:["+dynatraceIncidentList.size()+"]");
			
			int i=0;
			
			for (Iterator<DynatraceIncident> iterator = dynatraceIncidentList.iterator(); iterator.hasNext();) {
				
				DynatraceIncident dynatraceIncident = (DynatraceIncident) iterator.next();
				
				log.info("Incident to Close on Remedy:["+dynatraceIncident.getDynatraceIncidentKey()+"]");
				
				HelpDeskQueryServiceResponseDocument helpDeskQueryServiceResponseDocument = remedyClient.getIncidentFromRemedy(dynatraceIncident, remedyConfiguration);
				
				String status;
				
				if(helpDeskQueryServiceResponseDocument.getHelpDeskQueryServiceResponse().getStatus().intValue()!=ADRConstants.RESOLVED && helpDeskQueryServiceResponseDocument.getHelpDeskQueryServiceResponse().getStatus().intValue()!=ADRConstants.CLOSED) {
					log.info("Call Remedy for changing the ticket state to Resolved");
					remedyClient.resolveTicket(dynatraceIncident.getRemedyTicketID(),helpDeskQueryServiceResponseDocument,remedyConfiguration);
					i++;
					status=remedyConfiguration.getStatusResolved();
					
				}else {
					log.info("Updating the Remedy Ticket wiht the Resolved or Closed status. Ticket Status:["+helpDeskQueryServiceResponseDocument.getHelpDeskQueryServiceResponse().getStatus().toString()+"]");
					status=helpDeskQueryServiceResponseDocument.getHelpDeskQueryServiceResponse().getStatus().toString();
				}
				
				incidentDAO.setDynatraceIncidentStatus(dynatraceIncident,status);

			}
			
			log.info("Number of incident to closed on Remedy:["+i+"]");
			
			return env;

		
		} catch (Exception e) {
			throw new CloseRemedyIncidentException(
					"Exception on CloseRemedyIncidentException", e);
		}
	}
	

	public IncidentDAO getIncidentDAO() {
		return incidentDAO;
	}

	public void setIncidentDAO(IncidentDAO incidentDAO) {
		this.incidentDAO = incidentDAO;
	}


	public RemedyClientToClose getRemedyClient() {
		return remedyClient;
	}


	public void setRemedyClient(RemedyClientToClose remedyClient) {
		this.remedyClient = remedyClient;
	}


	public RemedyConfigurationRepository getRemedyConfigurationRepository() {
		return remedyConfigurationRepository;
	}


	public void setRemedyConfigurationRepository(RemedyConfigurationRepository remedyConfigurationRepository) {
		this.remedyConfigurationRepository = remedyConfigurationRepository;
	}

	
}

