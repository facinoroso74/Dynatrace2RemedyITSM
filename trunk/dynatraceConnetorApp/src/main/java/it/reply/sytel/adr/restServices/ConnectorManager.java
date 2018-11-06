package it.reply.sytel.adr.restServices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.reply.sytel.adr.constants.ADRConstants;
import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;
import it.reply.sytel.adr.domain.SchedulatorConfiguration;
import it.reply.sytel.adr.engine.RemedyIncidetBuilderEngine;
import it.reply.sytel.adr.quartz.SchedulerConfig;
import it.reply.sytel.adr.repositories.SchedulatorConfigurationRepository;
import it.reply.sytel.adr.services.enviromnent.ADREnvironment;

@RestController
@RequestMapping({"/schedulatorConfiguration"})
public class ConnectorManager {
    
	private Logger log = LogManager.getLogger(getClass());
    private static final String SCHEDULATOR_NAME="Schedulator";
    
	@Autowired
	private RemedyIncidetBuilderEngine remedyIncidetBuilderEngine; 
    
	@Autowired
	SchedulerConfig schedulerConfig;
	
	@Autowired
	SchedulatorConfigurationRepository schedulatorConfigurationRepository;
	
    @RequestMapping("/startOneShot")
    public void startOneShot() {
    	
    	log.info("Calling connector ONE SHOT...");
		Enviromnent envInput = new ADREnvironment();
    	remedyIncidetBuilderEngine.executeFlow(envInput);
    	log.info("Calling connector ONE SHOT... DONE");
    }
      
   
    @RequestMapping("/check")
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
    
//    @RequestMapping("/read")
//    public SchedulatorConfigurationll getSchedulatorConfigurationWithoutDB(){
//	   	try {
//	   		SchedulatorConfigurationll schedulatorConfiguration = new SchedulatorConfigurationll();
//	   		schedulatorConfiguration.setName("");
//	   		schedulatorConfiguration.setPatternSchedulator(schedulerConfig.getSchedulatorTime());
//	   		schedulatorConfiguration.setStarted(schedulerConfig.isJobStarted());
//	   		return schedulatorConfiguration;
//	   		
//    	}catch (Exception e) {
//			log.error("Exception on getting the Configuration",e);
//			throw new RuntimeException("Exception on getting the Configuration", e);
//		}
//	}
    
    @RequestMapping("/get")
    public SchedulatorConfiguration getSchedulatorConfiguration(){
	   	try {
	   		return schedulatorConfigurationRepository.findByName(ADRConstants.SCHEDULATOR_NAME); 		
    	}catch (Exception e) {
			log.error("Exception on getting the SchedulatorConfiguration",e);
			throw new RuntimeException("Exception on getting the SchedulatorConfiguration", e);
		}
	}
    
    @RequestMapping(value={"/put"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    public void saveSchedulatorConfiguration(SchedulatorConfiguration schedulatorConfiguration){
	   	try {
	   		schedulatorConfiguration.setSchedulatorConfigurationId(Long.parseLong("1"));
	   		schedulatorConfigurationRepository.save(schedulatorConfiguration); 		
    	}catch (Exception e) {
			log.error("Exception on saving the SchedulatorConfiguration:["+schedulatorConfiguration+"]",e);
			throw new RuntimeException("Exception on saving the SchedulatorConfiguration:["+schedulatorConfiguration+"]", e);
		}
	}
    
    
    @RequestMapping(value={"/start"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    public SchedulatorConfiguration startSchedulatorConfiguration(SchedulatorConfiguration schedulatorConfiguration){
    	try {
    		schedulerConfig.startConnector(schedulatorConfiguration.getCrontime());
	   		schedulatorConfiguration.setSchedulatorConfigurationId(Long.parseLong("1"));
	   		schedulatorConfiguration.setStatus("true");
	   		schedulatorConfigurationRepository.save(schedulatorConfiguration); 	
	   		return schedulatorConfiguration;
    	}catch (Exception e) {
			log.error("Exception on saving the SchedulatorConfiguration:["+schedulatorConfiguration+"]",e);
			throw new RuntimeException("Exception on saving the SchedulatorConfiguration:["+schedulatorConfiguration+"]", e);
		}
    }

    @RequestMapping(value={"/stop"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    public SchedulatorConfiguration stopSchedulatorConfiguration(SchedulatorConfiguration schedulatorConfiguration){
    	try {
    		schedulerConfig.stopConnector();
	   		schedulatorConfiguration.setSchedulatorConfigurationId(Long.parseLong("1"));
	   		schedulatorConfiguration.setStatus("false");
	   		schedulatorConfigurationRepository.save(schedulatorConfiguration); 	
	   		return schedulatorConfiguration;
    	}catch (Exception e) {
			log.error("Exception on saving the SchedulatorConfiguration:["+schedulatorConfiguration+"]",e);
			throw new RuntimeException("Exception on saving the SchedulatorConfiguration:["+schedulatorConfiguration+"]", e);
		}
    }
    
    @RequestMapping("/stop")
    public String stopScheduler() {
    	if(schedulerConfig.stopConnector())
    		return "STOPPED";
    	return "NOT STARTED";
	}
    
    
    
}
