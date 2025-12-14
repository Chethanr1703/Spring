package com.xworkz.dependency.dam;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Gate {

    public Gate() {
        System.out.println("Gate default cons invoked");
    }

    @Value("5")
    private int gateId;

    @Value("Spillway Gate")
    private String type;
}
