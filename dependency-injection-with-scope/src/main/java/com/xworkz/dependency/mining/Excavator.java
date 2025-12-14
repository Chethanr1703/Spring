package com.xworkz.dependency.mining;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Excavator {

    public Excavator() {
        System.out.println("Excavator default cons invoked");
    }

    @Value("9")
    private int excavatorId;

    @Value("Heavy Duty")
    private String type;
}
