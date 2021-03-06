package com.test.microservicegatewayzuulfallback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MicroserviceGatewayZuulFallbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceGatewayZuulFallbackApplication.class, args);
    }

}
