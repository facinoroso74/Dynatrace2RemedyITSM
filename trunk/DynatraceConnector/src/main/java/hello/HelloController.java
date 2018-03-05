package hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.reply.sytel.adr.constants.ADRConstants;
import it.reply.sytel.flowapp.data.TID;
import it.reply.sytel.flowapp.logging.NMDC;

@RestController
public class HelloController {
    private Logger log = LogManager.getLogger(getClass());
    
    @RequestMapping("/Hello1")
    public String index() {
    	NMDC.push();
		TID tid = new TID();
		NMDC.put(ADRConstants.TID, tid);

    	log.debug("holaaaaaaaaaaaaaaaaaaaa!!!!!!!!!!!!!!!! TID:["+tid+"]");
    	
    	NMDC.pop();
    	
        return "Greetings from Spring Boot---Hello1-------!" + hello.HelloController2.getHello2();
        
    }
    
}
