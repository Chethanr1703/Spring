package com.xworkz.dependency.port;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Port {

    public Port() {
        System.out.println("Port default cons invoked");
    }

    @Value("10")
    private int portId;

    @Value("Sea Port")
    private String name;

    @Autowired
    private Crane crane;
}
