package com.xworkz.dependency.policestation;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class PoliceStation {

    public PoliceStation() {
        System.out.println("PoliceStation default cons invoked");
    }

    @Value("4")
    private int stationId;

    @Value("City Police Station")
    private String name;

    @Autowired
    private PoliceOfficer policeOfficer;
}
