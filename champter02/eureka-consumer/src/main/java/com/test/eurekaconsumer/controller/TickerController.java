package com.test.eurekaconsumer.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class TickerController {
    @Value("${server.port}")
    String port;
    @Autowired
    private EurekaClient eurekaClient;
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/ticket")
    public String getTicker(){
        System.out.println("端口:"+port+"调用一次");
        return "我调用过来";
    }
    @RequestMapping("/serviceUrl")
    public String serviceUrl(){
        InstanceInfo instanceInfo=eurekaClient.getNextServerFromEureka("eureka-provider",false);
        return instanceInfo.getHomePageUrl();
    }
    @RequestMapping("/hello")
    public String hello(String name){
        String s = restTemplate.getForObject("http://eureka-provider/ticket", String.class);
        return name+"购买了"+s;
    }
}
