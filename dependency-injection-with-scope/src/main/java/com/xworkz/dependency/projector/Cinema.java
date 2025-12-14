package com.xworkz.dependency.projector;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Cinema {

    public Cinema() {
        System.out.println("Cinema default cons invoked");
    }

    @Value("6")
    private int cinemaId;

    @Value("PVR")
    private String name;

    @Autowired
    Projector projector;
}
