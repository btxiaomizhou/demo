package com.test.eurekafeignwithhystrixfactory.feign;

import org.springframework.stereotype.Component;

@Component
public class FeignHystrixFallback implements FeignHystrixFactory {
    @Override
    public String ticket(String name) {
        return name;
    }
}
