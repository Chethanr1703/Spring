package com.xworkz.dependency.atm;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Cash {

    public Cash() {
        System.out.println("Cash default cons invoked");
    }

    @Value("3")
    private int Id;

    @Value("Active")
    private String status;
}
