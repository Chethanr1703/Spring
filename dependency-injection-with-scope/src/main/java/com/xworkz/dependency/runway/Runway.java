package com.xworkz.dependency.runway;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Runway {

    public Runway() {
        System.out.println("Runway default cons invoked");
    }

    @Value("1")
    private int runwayId;

    @Value("International")
    private String type;
}
