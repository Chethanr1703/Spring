package com.xworkz.dependency.shop;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Shop {

    public Shop() {
        System.out.println("Shop default cons invoked");
    }

    @Value("2")
    private int shopId;

    @Value("Grocery Store")
    private String type;

    @Autowired
    private Owner owner;
}
