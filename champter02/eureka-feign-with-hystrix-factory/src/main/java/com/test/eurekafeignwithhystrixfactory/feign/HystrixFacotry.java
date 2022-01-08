package com.test.eurekafeignwithhystrixfactory.feign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixFacotry implements FallbackFactory<FeignHystrixFactory> {
    @Override
    public FeignHystrixFactory create(Throwable throwable) {
        return new UserFeignWithFactory() {
            @Override
            public String ticket(String name) {
                return name;
            }
        };
    }
}
