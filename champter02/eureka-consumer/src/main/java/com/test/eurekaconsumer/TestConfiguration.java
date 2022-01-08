package com.test.eurekaconsumer;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ExcludeFromComponentScan
public class TestConfiguration {
   /* @Autowired
    private IClientConfig config;*/
    @Bean
    @ConditionalOnMissingBean
    public IRule rule(/*IClientConfig config*/){
        return new RandomRule();
    }
}
