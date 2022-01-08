package com.test.eurekafeignwithhystrixfactory.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//fallback与fallbackfactory一起用会有冲突的
@FeignClient(name="eureka-provider",/*fallback = FeignHystrixFallback.class,*/fallbackFactory =HystrixFacotry.class )
public interface FeignHystrixFactory {
    @RequestMapping("/ticket")
    public String ticket(@RequestParam("name") String name);
}
