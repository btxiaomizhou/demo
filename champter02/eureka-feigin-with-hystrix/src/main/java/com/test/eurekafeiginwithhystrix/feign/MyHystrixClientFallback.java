package com.test.eurekafeiginwithhystrix.feign;

import org.springframework.stereotype.Component;

@Component
public class MyHystrixClientFallback implements FeignHystrix {
    @Override
    public String ticket(String name) {
        return "fff";
    }
}
