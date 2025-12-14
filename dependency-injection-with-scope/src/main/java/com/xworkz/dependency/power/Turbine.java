package com.xworkz.dependency.power;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Turbine {

    public Turbine() {
        System.out.println("Turbine default cons invoked");
    }

    @Value("1")
    private int turbineId;

    @Value("Steam Turbine")
    private String type;
}
