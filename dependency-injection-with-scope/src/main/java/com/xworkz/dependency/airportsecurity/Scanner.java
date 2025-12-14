package com.xworkz.dependency.airportsecurity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Scanner {

    public Scanner() {
        System.out.println("Scanner default cons invoked");
    }

    @Value("1")
    private int scannerId;

    @Value("X-Ray Scanner")
    private String type;
}
