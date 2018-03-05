package it.reply.sytel.adr.main;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.ApplicationContext;

import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;
import it.reply.sytel.adr.engine.RemedyIncidetBuilderEngine;
import it.reply.sytel.adr.services.enviromnent.ADREnvironment;
import it.reply.sytel.adr.springContext.SpringContext;

@DisallowConcurrentExecution
public class ConnectorExecutor implements Job {

	org.apache.logging.log4j.Logger log=org.apache.logging.log4j.LogManager.getLogger(getClass());
	
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		try {
			Enviromnent envInput = new ADREnvironment();
			ApplicationContext ctx = SpringContext.getInstance().getSpringContext();
			RemedyIncidetBuilderEngine connectorEngine = (RemedyIncidetBuilderEngine)ctx.getBean("remedyIncidetBuilderEngine");
			connectorEngine.executeFlow(envInput);
		}catch (Exception e) {
			log.error("Exception on execution the Connector",e);
		}
		
	}

}
