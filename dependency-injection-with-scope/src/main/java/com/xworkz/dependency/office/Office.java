package com.xworkz.dependency.office;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Office {

    public Office() {
        System.out.println("Office default cons invoked");
    }

    @Value("10")
    private int officeId;

    @Value("Corporate Office")
    private String name;

    @Autowired
    private Printer printer;
}
