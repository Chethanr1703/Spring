package com.xworkz.dependency.airportsecurity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class AirportSecurity {

    public AirportSecurity() {
        System.out.println("AirportSecurity default cons invoked");
    }

    @Value("2")
    private int securityId;

    @Value("Terminal Security")
    private String department;

    @Autowired
    private Scanner scanner;
}
