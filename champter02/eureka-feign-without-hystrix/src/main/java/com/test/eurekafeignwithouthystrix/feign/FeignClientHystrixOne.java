package com.test.eurekafeignwithouthystrix.feign;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="eureka-provider",fallback = MyHystrixClientOneFallback.class/*,configuration = FeignConfigurationTwo.class*/)
public interface FeignClientHystrixOne {
    @RequestMapping("/urlTest")
    public String urlTest(@RequestParam("serviceName") String serviceName);
}
