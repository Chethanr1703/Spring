package com.xworkz.dependency.gym;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Trainer {

    public Trainer() {
        System.out.println("Trainer default cons invoked");
    }

    @Value("3")
    private int trainerId;

    @Value("Fitness")
    private String specialization;
}
