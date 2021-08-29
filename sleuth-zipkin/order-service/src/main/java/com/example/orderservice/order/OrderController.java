package com.example.orderservice.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService service;

    @Autowired
    OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public String createOrder(@RequestBody Basket basket) {
            service.createOrder(basket);
            return "Create";
    }
}
