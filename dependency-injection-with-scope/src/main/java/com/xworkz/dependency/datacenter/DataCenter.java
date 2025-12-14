package com.xworkz.dependency.datacenter;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class DataCenter {

    public DataCenter() {
        System.out.println("DataCenter default cons invoked");
    }

    @Value("2")
    private int centerId;

    @Value("Cloud DC")
    private String name;

    @Autowired
    private Server server;
}
