package com.test.ribbonone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonOneController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @RequestMapping("/buy")
    public String butTicket(String name){
        String s = restTemplate.getForObject("http://eureka-provider/ticket", String.class);
        return name+"购买了"+s;
    }
}
