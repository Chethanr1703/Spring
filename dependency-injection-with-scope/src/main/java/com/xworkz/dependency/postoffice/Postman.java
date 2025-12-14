package com.xworkz.dependency.postoffice;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Postman {

    public Postman() {
        System.out.println("Postman default cons invoked");
    }

    @Value("7")
    private int postmanId;

    @Value("Suresh")
    private String name;
}
