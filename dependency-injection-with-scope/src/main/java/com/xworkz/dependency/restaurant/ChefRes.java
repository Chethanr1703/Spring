package com.xworkz.dependency.restaurant;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class ChefRes {

    public ChefRes() {
        System.out.println("Chef default cons invoked");
    }

    @Value("7")
    private int chefId;

    @Value("South Indian")
    private String specialty;
}
