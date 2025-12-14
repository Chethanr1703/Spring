package com.xworkz.dependency.mining;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class MiningSite {

    public MiningSite() {
        System.out.println("MiningSite default cons invoked");
    }

    @Value("10")
    private int siteId;

    @Value("Coal Mine")
    private String name;

    @Autowired
    private Excavator excavator;
}
