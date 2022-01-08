package com.test.eurekafeignone.feign;

import com.test.configuration.FeignConfigurationOne;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient(name="eureka-provider",configuration = FeignConfigurationOne.class)
public interface FeignOneClient {
    @RequestLine("POST /rice")
    public String test(@RequestBody Map<String,String> hashMap);
}
