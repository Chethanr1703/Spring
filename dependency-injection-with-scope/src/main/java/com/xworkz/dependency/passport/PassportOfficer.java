package com.xworkz.dependency.passport;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class PassportOfficer {

    public PassportOfficer() {
        System.out.println("Officer default cons invoked");
    }

    @Value("1")
    private int officerId;

    @Value("Verification Officer")
    private String role;
}
