package com.example.orderservice.order;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Basket implements Serializable {

    private String name;
}
