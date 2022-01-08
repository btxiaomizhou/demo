package com.test.eurekafeignone.controller;

import com.test.eurekafeignone.feign.FeignOneClient;
import com.test.eurekafeignone.feign.FeignTwoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FeignOneController {
    @Autowired
    private FeignOneClient feignOneClient;

    @Autowired
    private FeignTwoClient feignTwoClient;
    @RequestMapping("/test")
    public String test(){
        Map<String,String> hashMap=new HashMap<>();
        hashMap.put("username","xiaoyi");
        hashMap.put("password","123456");
        return "我输出的用户信息:"+feignOneClient.test(hashMap);
    }

    @RequestMapping("/urlTest")
    public String urlTest(String serviceName){
        return "我输出的用户信息:"+feignTwoClient.urlTest(serviceName);
       /* return null;*/
    }
}
