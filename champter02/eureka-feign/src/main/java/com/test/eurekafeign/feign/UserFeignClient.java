package com.test.eurekafeign.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name="eureka-provider")
public interface UserFeignClient {
    @RequestMapping(method = RequestMethod.GET,value = "/ticket")
    public String getTicker(@RequestParam("name") String name);//1.GetMapping不支持   2.PathVariable得设置value

    @RequestMapping(method = RequestMethod.POST,value = "/rice")
    public String getTicker(@RequestBody  Map<String,String> hashMap);//1.GetMapping不支持   2.PathVariable得设置value
}
