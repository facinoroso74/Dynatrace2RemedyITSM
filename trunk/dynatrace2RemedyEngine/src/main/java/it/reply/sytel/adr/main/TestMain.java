package it.reply.sytel.adr.main;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;

import it.reply.sytel.adr.common.quartz.QuartzSchedulerBean;
import it.reply.sytel.adr.constants.ADRConstants;

public class TestMain {

	
	private static org.apache.logging.log4j.Logger log=org.apache.logging.log4j.LogManager.getLogger("it.reply.sytel.rma.main.TestMain");
	
	public static void main(String[] args) {
		
		try{

			String schedulatorTime="0/10 * * * * ?";

			Scheduler scheduler = QuartzSchedulerBean.getInstance().getSched();

			JobKey jobKey = new JobKey(ADRConstants.JOB_NAME_CONNECTOR,ADRConstants.JOB_NAME_GROUP_CONNECTOR);

			JobDetail job = JobBuilder.newJob(ConnectorExecutor.class).withIdentity(jobKey).build();

			TriggerKey triggerKey = new TriggerKey(ADRConstants.TRIGGER_NAME_CONNECTOR,ADRConstants.TRIGGER_NAME_GROUP_CONNECTOR);

			Trigger trigger = TriggerBuilder
					.newTrigger()
					.withIdentity(triggerKey).startNow()
					.withSchedule(CronScheduleBuilder.cronSchedule(schedulatorTime)).build();

			scheduler.scheduleJob(job,trigger);
			
		}catch(Exception e){
			log.error(e,e);
		}
	}
	
	
	
}
