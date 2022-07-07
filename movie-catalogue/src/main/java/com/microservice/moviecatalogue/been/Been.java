package com.microservice.moviecatalogue.been;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Been {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplateBeen(){
        return new RestTemplate();
    }
    @Bean
    public HttpHeaders getHttpHeadersBeen(){
        return new HttpHeaders();
    }
}