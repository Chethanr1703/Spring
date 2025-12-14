package com.xworkz.dependency.multispecalityhospital;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Patients {

    public Patients() {
        System.out.println("Patients default cons invoked");
    }

    @Value("1")
    private int Id;

}
