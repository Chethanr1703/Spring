package com.xworkz.dependency.apartment;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Security {

    public Security() {
        System.out.println("Security default cons invoked");
    }

    @Value("7")
    private int securityId;

    @Value("Night Shift")
    private String shift;
}
