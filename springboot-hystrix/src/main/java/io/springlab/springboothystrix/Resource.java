package io.springlab.springboothystrix;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Resource {

    @HystrixCommand(fallbackMethod = "fallbackSayHello",commandKey = "sayHello",groupKey = "sayHello")
    @GetMapping("/sayHello")
    public String getMessage(){
        if(RandomUtils.nextBoolean()){
            throw new RuntimeException("failed to return any message!");
        }
        return "Hey There!";
    }

    public String fallbackSayHello(){
        return "Hystrix :fallback Hey There";
    }
}
