package com.xworkz.dependency.space;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Rocket {

    public Rocket() {
        System.out.println("Rocket default cons invoked");
    }

    @Value("3")
    private int rocketId;

    @Value("Gaganyaan")
    private String name;
}
