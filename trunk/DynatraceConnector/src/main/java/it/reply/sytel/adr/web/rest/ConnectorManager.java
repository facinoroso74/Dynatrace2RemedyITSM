package it.reply.sytel.adr.web.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
      
    @RequestMapping("/startConnectorScheduled")
    public String startScheduler() {
    	
//    	try{
//
//    		log.info("Starting Connector Scheduler...");
//    		
//			String schedulatorTime="0/5 * * * * ?";
//
//			Scheduler scheduler = QuartzSchedulerBean.getInstance().getSched();
//
//			JobKey jobKey = new JobKey(ADRConstants.JOB_NAME_CONNECTOR,ADRConstants.JOB_NAME_GROUP_CONNECTOR);
//
//			JobDetail job = JobBuilder.newJob(ConnectorExecutor.class).withIdentity(jobKey).build();
//
//			TriggerKey triggerKey = new TriggerKey(ADRConstants.TRIGGER_NAME_CONNECTOR,ADRConstants.TRIGGER_NAME_GROUP_CONNECTOR);
//
//			Trigger trigger = TriggerBuilder
//					.newTrigger()
//					.withIdentity(triggerKey).startNow()
//					.withSchedule(CronScheduleBuilder.cronSchedule(schedulatorTime)).build();
//
//			scheduler.scheduleJob(job,trigger);
//			
//			log.info("Starting Connector Scheduler...DONE");
//			
//			return "started";
//			
//		}catch(Exception e){
//			log.error("Exception on scheduling connector job",e);
//			return "not started";
//		}
    	//createTrigger(jobDetail, pollFrequencyMs);
    	return "";
    }

    @RequestMapping("/stopConnectorScheduled")
    public String stopScheduler() {
//    	try
//		{
//    		log.info("Stopping Connector Scheduler...");
//			Scheduler scheduler = QuartzSchedulerBean.getInstance().getSched();
//
//			TriggerKey triggerKey = new TriggerKey(ADRConstants.TRIGGER_NAME_CONNECTOR,ADRConstants.TRIGGER_NAME_GROUP_CONNECTOR);
//
//			scheduler.unscheduleJob(triggerKey);
//			
//			log.info("Stopping Connector Scheduler... DONE");
//			
//			return "stopped";
//		}
//		catch (Exception e)
//		{
//			log.error("Exception on unscheduling connector job", e);
//			return "not stopped";
//		}
    	return "";
	}
    
    @RequestMapping("/checkStatusSchedulator")
    public String checkStatusSchedulator()
	{
//		try
//		{
//			GroupMatcher<TriggerKey> groupMatcher = GroupMatcher.triggerGroupStartsWith(ADRConstants.TRIGGER_NAME_GROUP_CONNECTOR);
//
//			Scheduler sched = QuartzSchedulerBean.getInstance().getSched();
//
//			Set<TriggerKey> triggerKeySet = sched.getTriggerKeys(groupMatcher);
//			if (triggerKeySet.size() > 0) {
//				return "ACTIVE";
//			}
//			return "NOTACTIVE";
//		}
//		catch (Exception e)
//		{
//			log.error("Exception on getting the connector job status",e);
//			return "ERROR";
//		}
    	
    	if(schedulerConfig.checkStatusTrigger())
    		return "RUNNING";
    	else
    		return "NOT RUNNING";
    		
	}

    
    
}
