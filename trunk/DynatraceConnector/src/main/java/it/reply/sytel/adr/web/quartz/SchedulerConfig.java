package it.reply.sytel.adr.web.quartz;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.Scheduler;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
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

@Configuration
public class SchedulerConfig {

    private static final Logger log = LogManager.getLogger(SchedulerConfig.class);

    private SchedulerFactoryBean factory;
    
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
        factory.setTriggers(simpleJobTrigger);
        log.info("starting jobs....");
        return factory;
    }

    @Bean
    public SimpleTriggerFactoryBean simpleJobTrigger(@Qualifier("simpleJobDetail") JobDetail jobDetail,
            @Value("${simplejob.frequency}") long frequency) {
        
    	log.info("simpleJobTrigger");

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
    	
    	System.out.println("HELLOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
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
    
    public boolean checkStatusTrigger() {
		try {
	    	GroupMatcher<TriggerKey> groupMatcher = GroupMatcher.triggerGroupStartsWith("spring-boot-quartz-demo");
			Scheduler sched = factory.getScheduler();
	
			Set<TriggerKey> triggerKeySet = sched.getTriggerKeys(groupMatcher);
			
			List<JobExecutionContext> jobExecutionContextList = sched.getCurrentlyExecutingJobs();
			System.out.println("-------------------------------------------------jobExecutionCTXList number:["+jobExecutionContextList.size()+"]");
			for (Iterator<JobExecutionContext> iterator = jobExecutionContextList.iterator(); iterator.hasNext();) {
				JobExecutionContext jobExecutionContext = (JobExecutionContext) iterator.next();
				System.out.println("JobExecutionContext:["+jobExecutionContext+"]");
			}
			
			if (triggerKeySet.size() > 0) {
				return true;
			}
			return false;
		}catch (Exception e) {
			log.error("Exception on checkStatusTrigger",e);
			return false;
		}
    }
    
    
    
}