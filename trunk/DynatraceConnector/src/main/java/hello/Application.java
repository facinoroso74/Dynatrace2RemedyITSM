package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import it.reply.sytel.adr.core.services.enviromnent.Enviromnent;
import it.reply.sytel.adr.engine.RemedyIncidetBuilderEngine;
import it.reply.sytel.adr.services.enviromnent.ADREnvironment;

@SpringBootApplication
public class Application {
    
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        
        System.out.println("Let's inspect the beans provided by Spring Boot:");
        
//        String[] beanNames = ctx.getBeanDefinitionNames();
//        Arrays.sort(beanNames);
//        for (String beanName : beanNames) {
//            System.out.println(beanName);
//        }
        
        String prova = (String)ctx.getBean("xmlStringBean1");
        System.out.println("prova----->"+prova);
        
        Enviromnent envInput = new ADREnvironment();
        RemedyIncidetBuilderEngine connectorEngine = (RemedyIncidetBuilderEngine)ctx.getBean("remedyIncidetBuilderEngine");
		connectorEngine.executeFlow(envInput);
        
    }

}
