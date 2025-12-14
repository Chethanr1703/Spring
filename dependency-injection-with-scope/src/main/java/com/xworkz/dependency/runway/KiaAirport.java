package com.xworkz.dependency.runway;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class KiaAirport {

    public KiaAirport() {
        System.out.println("KiaAirport default cons invoked");
    }

    @Value("2")
    private int airportId;

    @Value("Kempegowda Airport")
    private String name;

    @Autowired
    private Runway runway;
}
