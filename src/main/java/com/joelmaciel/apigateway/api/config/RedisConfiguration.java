package com.joelmaciel.apigateway.api.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class RedisConfiguration {

    @Bean
    KeyResolver userKeyResolver() {
        return exchange -> Mono.just("userKey");
    }
}
