package com.test.eurekawithpropagation.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaPropagationController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/test")
    @HystrixCommand(fallbackMethod = "testFallBack"/*,commandProperties = @HystrixProperty(name="execution.isolation.strategy",value="SEMAPHORE")*/)
    public String test(String name){
        String str=restTemplate.getForEntity("http://eureka-provider/ticket/",String.class).getBody();
        return str;
    }
    public String testFallBack(String name){
        return "错误访问，参数为:"+name;
    }
}
