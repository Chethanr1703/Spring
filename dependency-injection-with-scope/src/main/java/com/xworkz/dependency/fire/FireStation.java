package com.xworkz.dependency.fire;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class FireStation {

    public FireStation() {
        System.out.println("FireStation default cons invoked");
    }

    @Value("8")
    private int stationId;

    @Value("Central Station")
    private String name;

    @Autowired
    private FireEngine fireEngine;
}
