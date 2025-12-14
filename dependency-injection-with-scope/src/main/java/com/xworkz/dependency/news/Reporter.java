package com.xworkz.dependency.news;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Reporter {

    public Reporter() {
        System.out.println("Reporter default cons invoked");
    }

    @Value("5")
    private int reporterId;

    @Value("Political")
    private String beat;
}
