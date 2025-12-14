package com.xworkz.dependency.mall;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Shops {

    public Shops() {
        System.out.println("Shop default cons invoked");
    }

    @Value("9")
    private int shopId;

    @Value("Clothing Store")
    private String type;
}
