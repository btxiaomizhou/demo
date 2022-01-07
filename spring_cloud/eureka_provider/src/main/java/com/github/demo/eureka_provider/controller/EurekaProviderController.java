package com.github.demo.eureka_provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class EurekaProviderController {
    @Value("${server.port}")
    String port;
    @GetMapping("/ticket")
    public String getTicker(/*@RequestParam("name") String name*/){
        System.out.println("端口:"+port);
        return "我调用过来";
    }
    @PostMapping("/rice")
    public String rice(@RequestBody Map<String,String> hashMap){
        return hashMap.toString();
    }

    @RequestMapping("/urlTest")
    public String urlTest(@RequestParam("serviceName") String serviceName){
        System.out.println("端口:"+port);
        return "我输出的内容为:"+serviceName;
    }
}
