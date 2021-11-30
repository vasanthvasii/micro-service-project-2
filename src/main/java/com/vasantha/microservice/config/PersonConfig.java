package com.vasantha.microservice.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class PersonConfig {

    @Bean
    public RestTemplate createRestObject(){
        return new RestTemplate();
    }

    @Bean
    public ObjectMapper createObjectMapper(){
        return new ObjectMapper();
    }
}
