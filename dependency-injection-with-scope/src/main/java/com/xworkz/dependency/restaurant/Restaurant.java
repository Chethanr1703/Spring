package com.xworkz.dependency.restaurant;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Restaurant {

    public Restaurant() {
        System.out.println("Restaurant default cons invoked");
    }

    @Value("8")
    private int restaurantId;

    @Value("Udupi Hotel")
    private String name;

    @Autowired
    private ChefRes chef;
}
