package com.xworkz.dependency.port;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Crane {

    public Crane() {
        System.out.println("Crane default cons invoked");
    }

    @Value("9")
    private int craneId;

    @Value("Container Crane")
    private String type;
}
