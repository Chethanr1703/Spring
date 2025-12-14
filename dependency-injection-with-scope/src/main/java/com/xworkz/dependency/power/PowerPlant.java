package com.xworkz.dependency.power;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class PowerPlant {

    public PowerPlant() {
        System.out.println("PowerPlant default cons invoked");
    }

    @Value("2")
    private int plantId;

    @Value("Thermal Plant")
    private String name;

    @Autowired
    private Turbine turbine;
}
