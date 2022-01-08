package com.test.eurekafeignwithouthystrix.feign;

import org.springframework.stereotype.Component;

@Component
public class MyHystrixClientFallback implements FeignClientHystrix {
    @Override
    public String ticket(String name) {
        return "fff";
    }
}
