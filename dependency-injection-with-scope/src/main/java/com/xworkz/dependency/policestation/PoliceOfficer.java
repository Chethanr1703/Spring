package com.xworkz.dependency.policestation;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class PoliceOfficer {

    public PoliceOfficer() {
        System.out.println("PoliceOfficer default cons invoked");
    }

    @Value("3")
    private int officerId;

    @Value("Inspector")
    private String rank;
}
