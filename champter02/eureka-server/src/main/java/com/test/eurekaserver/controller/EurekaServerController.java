package com.test.eurekaserver.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaServerController {
    @Autowired
    private EurekaClient eurekaClient;
    @RequestMapping("/serviceUrl")
    public String serviceUrl(){
        InstanceInfo instanceInfo=eurekaClient.getNextServerFromEureka("ABC",false);
        return instanceInfo.getHomePageUrl();
    }
}
