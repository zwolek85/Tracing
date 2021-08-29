package com.example.orderservice.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.cloud.sleuth.annotation.SpanTag;
import org.springframework.stereotype.Service;

@Service
@Slf4j
class OrderService {

    @NewSpan
    public void createOrder(@SpanTag("basket")Basket basket) {
        log.info("Create order for " + basket);
    }
}
