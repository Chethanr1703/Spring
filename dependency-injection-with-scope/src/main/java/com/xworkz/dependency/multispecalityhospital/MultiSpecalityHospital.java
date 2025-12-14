package com.xworkz.dependency.multispecalityhospital;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class MultiSpecalityHospital {

    public MultiSpecalityHospital() {
        System.out.println("Hospital default cons invoked");
    }

    @Value("2")
    private int hospitalId;

    @Value("Apollo Hospital")
    private String name;

    @Autowired
    private Patients patients;
}
