package it.reply.sytel.adr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:applicationContext.xml"})
//@ImportResource({"file:///opt/dynatrace/remedyConnector/config/applicationContext.xml"})
public class SpringTilesApplication
  extends SpringBootServletInitializer
{
  public static void main(String[] args)
  {
    SpringApplication.run(SpringTilesApplication.class, args);
  }
  
}
