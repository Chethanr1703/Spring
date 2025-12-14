package com.xworkz.dependency.mall;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Mall {

    public Mall() {
        System.out.println("Mall default cons invoked");
    }

    @Value("10")
    private int mallId;

    @Value("Orion Mall")
    private String name;

    @Autowired
    private Shops shop;
}
