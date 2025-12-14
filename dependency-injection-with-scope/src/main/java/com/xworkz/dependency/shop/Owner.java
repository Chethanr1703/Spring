package com.xworkz.dependency.shop;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Owner {

    public Owner() {
        System.out.println("Owner default cons invoked");
    }

    @Value("1")
    private int ownerId;

    @Value("Mahesh")
    private String name;
}
