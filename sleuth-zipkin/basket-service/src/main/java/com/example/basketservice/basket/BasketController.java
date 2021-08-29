package com.example.basketservice.basket;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/basket")
class BasketController {

    private final BasketService service;

    @Autowired
    BasketController(BasketService service) {
        this.service = service;
    }

    @GetMapping
    String getBasket() {
        service.getBasket("amazing");
        return "basket";
    }

    @PostMapping
    String createOrder(@RequestBody Basket basket) {
        service.createOrder(basket);
        return "Order Create for Basket " + basket;
    }

}
