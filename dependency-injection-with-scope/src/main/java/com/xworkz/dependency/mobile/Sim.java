package com.xworkz.dependecnyapp.mobile;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Sim {

    public Sim() {
        System.out.println("SIM default cons invoked");
    }

    @Value("1")
    private int simId;

    @Value("Airtel")
    private String network;
}
