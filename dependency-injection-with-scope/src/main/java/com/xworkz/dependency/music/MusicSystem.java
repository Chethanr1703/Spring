package com.xworkz.dependency.music;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class MusicSystem {

    public MusicSystem() {
        System.out.println("MusicSystem default cons invoked");
    }

    @Value("8")
    private int systemId;

    @Value("Home Theatre")
    private String type;

    @Autowired
    private Speaker speaker;
}
