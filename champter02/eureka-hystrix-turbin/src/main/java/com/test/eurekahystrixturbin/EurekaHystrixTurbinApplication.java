package com.test.eurekahystrixturbin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class EurekaHystrixTurbinApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHystrixTurbinApplication.class, args);
    }

}
