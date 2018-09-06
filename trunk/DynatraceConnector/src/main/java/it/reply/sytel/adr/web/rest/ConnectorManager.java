package it.reply.sytel.adr.web.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;
import it.reply.sytel.adr.engine.RemedyIncidetBuilderEngine;
import it.reply.sytel.adr.services.enviromnent.ADREnvironment;
import it.reply.sytel.adr.web.quartz.SchedulerConfig;

@RestController
public class ConnectorManager {
    
	
	private Logger log = LogManager.getLogger(getClass());
    
	@Autowired
	private RemedyIncidetBuilderEngine remedyIncidetBuilderEngine;
    
	@Autowired
	SchedulerConfig schedulerConfig;
	
	
    @RequestMapping("/startConnectorOneShot")
    public void startOneShot() {
    	
    	log.info("Calling connector ONE SHOT...");
		Enviromnent envInput = new ADREnvironment();
    	remedyIncidetBuilderEngine.executeFlow(envInput);
    	log.info("Calling connector ONE SHOT... DONE");
    }
      
    @RequestMapping(value ="/startConnectorScheduled",method = RequestMethod.GET)
    public String startScheduler(@RequestParam("schedulatorTime") String schedulatorTime) {
    	if(schedulerConfig.startConnector(schedulatorTime))
    		return "STARTED";
    	return "NOT STARTED";
    }

    @RequestMapping("/stopConnectorScheduled")
    public String stopScheduler() {
    	if(schedulerConfig.stopConnector())
    		return "STOPPED";
    	return "NOT STARTED";
	}
    
    @RequestMapping("/checkStatusSchedulator")
    public String checkStatusSchedulator(){
	   	try {
	   		if(schedulerConfig.isJobStarted())
	    		return "RUNNING";
	    	return "NOT RUNNING";
    	}catch (Exception e) {
			log.error("Exception in checking the status");
			return "ERROR";
		}
	}
    
}
