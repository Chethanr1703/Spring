package com.xworkz.dependency.office;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Printer {

    public Printer() {
        System.out.println("Printer default cons invoked");
    }

    @Value("9")
    private int printerId;

    @Value("Laser Printer")
    private String type;
}
