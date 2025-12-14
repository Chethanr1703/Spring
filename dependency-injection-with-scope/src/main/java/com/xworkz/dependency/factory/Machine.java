package com.xworkz.dependency.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Machine {

    public Machine() {
        System.out.println("Machine default cons invoked");
    }

    @Value("9")
    private int machineId;

    @Value("CNC Machine")
    private String type;
}
