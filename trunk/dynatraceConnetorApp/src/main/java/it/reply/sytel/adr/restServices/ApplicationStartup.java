package it.reply.sytel.adr.restServices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

import it.reply.sytel.adr.domain.SchedulatorConfiguration;
import it.reply.sytel.adr.quartz.SchedulerConfig;
import it.reply.sytel.adr.repositories.SchedulatorConfigurationRepository;

public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

	private Logger log = LogManager.getLogger(getClass());
    private static final String SCHEDULATOR_NAME="Schedulator";
	
		@Autowired
		SchedulerConfig schedulerConfig;
		
		@Autowired
		SchedulatorConfigurationRepository schedulatorConfigurationRepository;
	
	  /**
	   * This event is executed as late as conceivably possible to indicate that 
	   * the application is ready to service requests.
	   */
	  @Override
	  public void onApplicationEvent(final ApplicationReadyEvent event) {
		  log.info("onApplicationEvent CALLED - BEGIN!!!!!!!!!!!!!!");
	    // here your code ...
		SchedulatorConfiguration schedulatorConfiguration = schedulatorConfigurationRepository.findByName(SCHEDULATOR_NAME);
		if(schedulatorConfiguration.getStatus().equals("true")) {
			schedulerConfig.startConnector(schedulatorConfiguration.getCrontime());
			log.info("start CALLED!!!!!!!!!!!!!!");
		}
		log.info("onApplicationEvent CALLED - END!!!!!!!!!!!!!!");
	    return;
	    
	  }
	  
}
