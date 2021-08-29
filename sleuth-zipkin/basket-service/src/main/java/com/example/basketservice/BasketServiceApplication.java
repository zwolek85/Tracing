package com.example.basketservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BasketServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasketServiceApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(){
         return new RestTemplate();
    }

}
