package hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import it.reply.sytel.flowapp.data.TID;

//@RestController
public class HelloController {
    
	private Logger log = LogManager.getLogger(getClass());
    
  //  @RequestMapping("/Hello1")
    public String index() {
    	
		TID tid = new TID();

    	log.debug("holaaaaaaaaaaaaaaaaaaaa!!!!!!!!!!!!!!!! TID:["+tid+"]");
    	
        return "Greetings from Spring Boot---Hello1-------!" + hello.HelloController2.getHello2();
        
    }
    
}
