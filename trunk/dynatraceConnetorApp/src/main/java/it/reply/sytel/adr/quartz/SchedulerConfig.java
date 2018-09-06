package it.reply.sytel.adr.quartz;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.quartz.impl.matchers.GroupMatcher;
import org.quartz.spi.JobFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

import it.reply.sytel.adr.constants.ADRConstants;
import it.reply.sytel.adr.quartz.exc.CheckStatusJobQuartzException;


@Configuration
public class SchedulerConfig {

    private static final Logger log = LogManager.getLogger(SchedulerConfig.class);

    private SchedulerFactoryBean factory;
    private String schedulatorTime="0/5 * * * * ?";
    
    
    @Bean
    public JobFactory jobFactory(ApplicationContext applicationContext) {
        AutowiringSpringBeanJobFactory jobFactory = new AutowiringSpringBeanJobFactory();
        jobFactory.setApplicationContext(applicationContext);
        return jobFactory;
    }

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(JobFactory jobFactory, Trigger simpleJobTrigger)
            throws IOException {
        //SchedulerFactoryBean factory = new SchedulerFactoryBean();
    	factory = new SchedulerFactoryBean();
        factory.setJobFactory(jobFactory);
        factory.setQuartzProperties(quartzProperties());
        //factory.setTriggers(simpleJobTrigger);
        return factory;
    }

    @Bean
    public SimpleTriggerFactoryBean simpleJobTrigger(@Qualifier("simpleJobDetail") JobDetail jobDetail,
            @Value("${simplejob.frequency}") long frequency) {
        
    	log.info("called simpleJobTrigger");

        SimpleTriggerFactoryBean factoryBean = new SimpleTriggerFactoryBean();
        factoryBean.setJobDetail(jobDetail);
        factoryBean.setStartDelay(0L);
        factoryBean.setRepeatInterval(frequency);
        factoryBean.setRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY);
        return factoryBean;
    }

    @Bean
    public Properties quartzProperties() throws IOException {
//        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
//        propertiesFactoryBean.setLocation(new ClassPathResource("/quartz.properties"));
//        propertiesFactoryBean.afterPropertiesSet();
//        return propertiesFactoryBean.getObject();
    	
    	/*
    	 * org.quartz.scheduler.instanceName=spring-boot-quartz-demo
org.quartz.scheduler.instanceId=AUTO
org.quartz.threadPool.threadCount=5
org.quartz.jobStore.class=org.quartz.simpl.RAMJobStore
    	 */
    	Properties prop = new Properties();
    	prop.put("org.quartz.scheduler.instanceName", "spring-boot-quartz-demo");
    	prop.put("org.quartz.scheduler.instanceId", "AUTO");
    	prop.put("org.quartz.threadPool.threadCount", "1");
    	prop.put("org.quartz.jobStore.class", "org.quartz.simpl.RAMJobStore");
    	
    	return prop;
    }

    @Bean
    public JobDetailFactoryBean simpleJobDetail() {
        JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
       // factoryBean.setJobClass(SampleJob.class);
        factoryBean.setJobClass(ConnectorExecutor.class);
        factoryBean.setDurability(true);
        
        return factoryBean;
    }
    
    public boolean startConnector(String schedulatorTime) {
    	
    	try {
    		if( schedulatorTime==null || schedulatorTime.length()==0 )
    			schedulatorTime=this.schedulatorTime;
    		else
    			this.schedulatorTime=schedulatorTime;
    		
    		if(isJobStarted())
    			return true;
    		
    		log.info("starting the connector..... with schedulatorTime:["+schedulatorTime+"]");
    		
    		Scheduler sched = factory.getScheduler();
    		
    		JobKey jobKey = new JobKey(ADRConstants.JOB_NAME_CONNECTOR, ADRConstants.JOB_NAME_GROUP_CONNECTOR);

			JobDetail job = JobBuilder.newJob(ConnectorExecutor.class).withIdentity(jobKey).build();
			//job.getJobDataMap().put("NUM_MONTHS", this.configuration.getNumMonthsSvecchiamentoTicket());

			TriggerKey triggerKey = new TriggerKey(ADRConstants.TRIGGER_NAME_CONNECTOR, ADRConstants.TRIGGER_NAME_GROUP_CONNECTOR);

			Trigger trigger = TriggerBuilder.newTrigger().withIdentity(triggerKey).startNow().withSchedule(CronScheduleBuilder.cronSchedule(schedulatorTime)).build();

			sched.scheduleJob(job, trigger);

	    	log.info("starting the connector.....DONE");
	    	return true;
	    	
    	}catch (Exception e) {
    		log.error("Exception on starting the Job",e);
    		return false;
		}
    }
    
    public boolean stopConnector() {
    	
    	try{
    		if(!isJobStarted())
    			return true;
    		
			Scheduler scheduler = factory.getScheduler();

			TriggerKey triggerKey = new TriggerKey(ADRConstants.TRIGGER_NAME_CONNECTOR, ADRConstants.TRIGGER_NAME_GROUP_CONNECTOR);

			return scheduler.unscheduleJob(triggerKey);
			
		}catch (Exception e) {
			log.error("Exception on stopping the Job",e);
    		return false;
		}
    }
 
    
    public boolean isJobStarted() throws CheckStatusJobQuartzException {

			try{
				GroupMatcher<TriggerKey> groupMatcher = GroupMatcher.triggerGroupStartsWith(ADRConstants.TRIGGER_NAME_GROUP_CONNECTOR);

				Scheduler sched = factory.getScheduler();

				Set<TriggerKey> triggerKeySet = sched.getTriggerKeys(groupMatcher);
				if (triggerKeySet.size() > 0) 
					return true;
				return false;
			}catch (Exception e){
				log.error("Exception on checkStatus Connector job", e);
				throw new CheckStatusJobQuartzException("Exception on checkStatus Connector job",e);
			}
	}

	public String getSchedulatorTime() {
		return schedulatorTime;
	}

	public void setSchedulatorTime(String schedulatorTime) {
		this.schedulatorTime = schedulatorTime;
	}
    
}