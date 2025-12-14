package com.xworkz.dependency.dam;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Dam {

    public Dam() {
        System.out.println("Dam default cons invoked");
    }

    @Value("6")
    private int damId;

    @Value("Hydro Dam")
    private String name;

    @Autowired
    private Gate gate;
}
