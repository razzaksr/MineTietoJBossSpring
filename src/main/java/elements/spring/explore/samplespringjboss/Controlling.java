package elements.spring.explore.samplespringjboss;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlling {
    @GetMapping("/")
    public String alpha(){
        return "BFSI";
    }
}
