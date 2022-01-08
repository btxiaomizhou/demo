package com.test.eurekafeignwithouthystrix.controller;

import com.test.eurekafeignwithouthystrix.feign.FeignClientHystrix;
import com.test.eurekafeignwithouthystrix.feign.FeignClientHystrixOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaWithoutHystrixController {
    @Autowired
    private FeignClientHystrix feignClientHystrix;
    @Autowired
    private FeignClientHystrixOne feignClientHystrixOne;
    @RequestMapping("/test")
    public String test(String name){
        return feignClientHystrix.ticket(name);
    }
    @RequestMapping("/urlTest")
    public String urlTest(String name){
        return feignClientHystrixOne.urlTest(name);
    }
}
