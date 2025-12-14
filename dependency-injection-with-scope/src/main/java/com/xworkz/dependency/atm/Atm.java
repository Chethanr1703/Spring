package com.xworkz.dependency.atm;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Atm {

    public Atm() {
        System.out.println("Atm default cons invoked");
    }

    @Value("4")
    private int atmId;

    @Value("BTM Layout")
    private String location;

    @Autowired
    private Cash cash;
}
