package it.reply.sytel.adr.web.quartz;

import org.apache.logging.log4j.Logger;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;
import it.reply.sytel.adr.engine.RemedyIncidetBuilderEngine;
import it.reply.sytel.adr.services.enviromnent.ADREnvironment;

@DisallowConcurrentExecution
public class ConnectorExecutor implements Job {

	@Autowired
	private RemedyIncidetBuilderEngine remedyIncidetBuilderEngine;
	
	Logger log=org.apache.logging.log4j.LogManager.getLogger(getClass());
	
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		try {
			Enviromnent envInput = new ADREnvironment();
			remedyIncidetBuilderEngine.executeFlow(envInput);
		}catch (Exception e) {
			log.error("Exception on execution the Connector",e);
		}
		
	}

}
