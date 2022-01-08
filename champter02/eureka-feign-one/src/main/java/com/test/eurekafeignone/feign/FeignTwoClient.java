package com.test.eurekafeignone.feign;

import com.test.configuration.FeignConfigurationTwo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="xxx",url="http://localhost:8002"/*,configuration = FeignConfigurationTwo.class*/)
public interface FeignTwoClient {
    @RequestMapping(value="/urlTest")
    public String urlTest(@RequestParam("serviceName") String serviceName);
}
