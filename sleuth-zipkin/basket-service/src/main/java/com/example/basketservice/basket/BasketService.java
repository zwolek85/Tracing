package com.example.basketservice.basket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.cloud.sleuth.annotation.SpanTag;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
class BasketService {

    private RestTemplate restTemplate;

    BasketService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @NewSpan
    public void getBasket(@SpanTag("basketType") String basketType) {
        log.info("Get basket type: " + basketType);
    }

    @NewSpan
    public void createOrder(@SpanTag("basket") Basket basket) {
        log.info("Create order : " + basket);
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        HttpEntity<Basket> request = new HttpEntity<>(basket, headers);

        ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity("http://localhost:9010/order", basket, String.class);
        log.info(" Response: ", stringResponseEntity);
    }
}
