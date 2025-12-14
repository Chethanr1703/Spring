package com.xworkz.dependency.music;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Speaker {

    public Speaker() {
        System.out.println("Speaker default cons invoked");
    }

    @Value("7")
    private int speakerId;

    @Value("Sony")
    private String brand;
}
