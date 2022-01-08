package com.test.eurekafeign.controller;

import com.test.eurekafeign.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FeignController {
   @Autowired
    private UserFeignClient userFeignClient;
    @RequestMapping("/test")
    public String test(String name) {
        return "我得到的内容:" + userFeignClient.getTicker(name);
    }
    @RequestMapping("/rice")
    public String rice(String name){
        Map<String,String> hashMap=new HashMap<>();
        hashMap.put("username","xiaoyi");
        hashMap.put("password","123456");
        hashMap.put("code","123456");
        return "我得到的内容:" + userFeignClient.getTicker(hashMap);
    }

}
