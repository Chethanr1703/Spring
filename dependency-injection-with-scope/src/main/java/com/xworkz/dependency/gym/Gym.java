package com.xworkz.dependency.gym;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Gym {

    public Gym() {
        System.out.println("Gym default cons invoked");
    }

    @Value("4")
    private int gymId;

    @Value("Gold's Gym")
    private String name;

    @Autowired
    private Trainer trainer;
}
