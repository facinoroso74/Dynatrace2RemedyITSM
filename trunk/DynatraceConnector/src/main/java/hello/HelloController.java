package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @RequestMapping("/Hello1")
    public String index() {
        return "Greetings from Spring Boot---Hello1-------!" + hello.HelloController2.getHello2();
        
    }
    
}
