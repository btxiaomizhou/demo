package com.test.eurekafeignwithhystrixfactory.controller;

import com.test.eurekafeignwithhystrixfactory.feign.FeignHystrixFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixFactoryController {
    @Autowired
    private FeignHystrixFactory feignHystrixFactory;
    @RequestMapping("/test")
    public String test(String name){
        return feignHystrixFactory.ticket(name);
    }
}
