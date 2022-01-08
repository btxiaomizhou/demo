package com.test.eurekafeiginwithhystrix.controller;

import com.test.eurekafeiginwithhystrix.feign.FeignHystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaFeignHystrixController {
    @Autowired
    private FeignHystrix feignHystrix;
    @RequestMapping("/test")
    public String test(String name){
        return feignHystrix.ticket(name)+":"+name;
    }
}
