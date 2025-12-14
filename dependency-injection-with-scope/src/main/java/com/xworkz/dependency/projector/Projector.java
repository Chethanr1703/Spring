package com.xworkz.dependency.projector;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Projector {

    public Projector() {
        System.out.println("Projector default cons invoked");
    }

    @Value("5")
    private int projectorId;

    @Value("4K")
    private String resolution;
}
