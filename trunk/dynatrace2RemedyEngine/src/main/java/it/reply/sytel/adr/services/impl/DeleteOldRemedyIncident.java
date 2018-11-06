package it.reply.sytel.adr.services.impl;

import java.sql.Timestamp;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;

import it.reply.sytel.adr.constants.ADRConstants;
import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;
import it.reply.sytel.adr.core.services.service.AbstractService;
import it.reply.sytel.adr.dao.IncidentDAO;
import it.reply.sytel.adr.domain.SchedulatorConfiguration;
import it.reply.sytel.adr.repositories.SchedulatorConfigurationRepository;
import it.reply.sytel.adr.services.exc.CloseRemedyIncidentException;

public class DeleteOldRemedyIncident extends AbstractService {

	private IncidentDAO incidentDAO;
	
	@Autowired
    private SchedulatorConfigurationRepository schedulatorConfigurationRepository;
	
	
	public DeleteOldRemedyIncident() {
		super(DeleteOldRemedyIncident.class.getName());
		log = LogManager.getLogger(getClass());

	}
	

	@Override
	protected Enviromnent perform(Enviromnent env) {

		try {
			Timestamp now = (Timestamp)env.get(ADRConstants.SYSDATE);
			
			SchedulatorConfiguration schedulatorConfiguration = schedulatorConfigurationRepository.findByName(ADRConstants.SCHEDULATOR_NAME);
			
			int recordDeletedNumber = incidentDAO.deleteOldDynatraceIncidents(schedulatorConfiguration.getRetentionDays());
			
			log.info("Number of record deleted:["+recordDeletedNumber+"]");
			
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

	
}

