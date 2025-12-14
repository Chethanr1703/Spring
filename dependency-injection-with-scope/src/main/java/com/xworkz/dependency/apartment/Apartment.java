package com.xworkz.dependency.apartment;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Apartment {

    public Apartment() {
        System.out.println("Apartment default cons invoked");
    }

    @Value("8")
    private int apartmentId;

    @Value("Prestige Apartments")
    private String name;

    @Autowired
    private Security security;
}
