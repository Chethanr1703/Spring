package com.xworkz.dependency.space;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class SpaceMission {

    public SpaceMission() {
        System.out.println("SpaceMission default cons invoked");
    }

    @Value("4")
    private int missionId;

    @Value("Human Space Flight")
    private String missionType;

    @Autowired
    private Rocket rocket;
}
