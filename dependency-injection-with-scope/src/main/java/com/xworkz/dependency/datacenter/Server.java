package com.xworkz.dependency.datacenter;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Server {

    public Server() {
        System.out.println("Server default cons invoked");
    }

    @Value("1")
    private int serverId;

    @Value("Application Server")
    private String type;
}
