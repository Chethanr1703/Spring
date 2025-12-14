package com.xworkz.dependency.courtcase;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Lawyer {

    public Lawyer() {
        System.out.println("Lawyer default cons invoked");
    }

    @Value("3")
    private int lawyerId;

    @Value("Criminal Lawyer")
    private String specialization;
}
