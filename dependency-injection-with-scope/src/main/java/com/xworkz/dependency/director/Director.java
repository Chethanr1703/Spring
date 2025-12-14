package com.xworkz.dependency.director;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Director {

    public Director() {
        System.out.println("Director default cons invoked");
    }

    @Value("9")
    private int directorId;

    @Value("Raj B shety")
    private String name;
}
