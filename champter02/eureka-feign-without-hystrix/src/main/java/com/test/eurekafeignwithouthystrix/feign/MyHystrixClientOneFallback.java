package com.test.eurekafeignwithouthystrix.feign;

import org.springframework.stereotype.Component;

@Component
public class MyHystrixClientOneFallback implements  FeignClientHystrixOne {
    @Override
    public String urlTest(String serviceName) {
        return "我调用的错误结果:"+serviceName;
    }
}
