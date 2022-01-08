package com.test.eurekaribbonwithhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HystrixController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/hello")
    //@HystrixCommand(fallbackMethod = "findByIdFallBack")
    public String hello(@RequestParam("name")String name){
        String s = restTemplate.getForObject("http://localhost:8002/ticket/" + name, String.class);
        return name+"购买了"+s;
    }
    public String findByIdFallBack(String name){
        return name;
    }
}
