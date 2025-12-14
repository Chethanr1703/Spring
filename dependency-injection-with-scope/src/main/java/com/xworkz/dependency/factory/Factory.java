package com.xworkz.dependency.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Factory {

    public Factory() {
        System.out.println("Factory default cons invoked");
    }

    @Value("10")
    private int factoryId;

    @Value("Textile Factory")
    private String name;

    @Autowired
    private Machine machine;
}
