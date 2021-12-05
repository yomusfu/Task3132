package com.task3132.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Task3132Application {

    public static void main(String[] args) {
        SpringApplication.run(Task3132Application.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {return new RestTemplateBuilder().build();}
}
