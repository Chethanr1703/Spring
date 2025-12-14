package com.xworkz.dependency.fire;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class FireEngine {

    public FireEngine() {
        System.out.println("FireEngine default cons invoked");
    }

    @Value("7")
    private int engineId;

    @Value("Rescue Engine")
    private String type;
}
