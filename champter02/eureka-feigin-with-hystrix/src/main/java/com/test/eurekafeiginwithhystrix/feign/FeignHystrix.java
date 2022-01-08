package com.test.eurekafeiginwithhystrix.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="eureka-provider",fallback = MyHystrixClientFallback.class)
public interface FeignHystrix {
    @RequestMapping(method = RequestMethod.GET,value = "/ticket")
    public String ticket(@RequestParam("name")String name);
}