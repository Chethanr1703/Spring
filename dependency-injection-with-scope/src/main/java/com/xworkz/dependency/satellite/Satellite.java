package com.xworkz.dependency.satellite;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Satellite {

    public Satellite() {
        System.out.println("Satellite default cons invoked");
    }

    @Value("7")
    private int satelliteId;

    @Value("INSAT")
    private String name;
}
