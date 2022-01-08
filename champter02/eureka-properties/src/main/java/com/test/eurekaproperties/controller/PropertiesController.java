package com.test.eurekaproperties.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PropertiesController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/test")
    public String test(String name){
        String str = restTemplate.getForObject("http://eureka-provider/ticket", String.class);
        return "我调用到结果:"+str;
    }
}
