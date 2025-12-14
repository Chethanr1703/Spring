package com.xworkz.dependency.passport;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class PassportOffice {

    public PassportOffice() {
        System.out.println("PassportOffice default cons invoked");
    }

    @Value("2")
    private int officeId;

    @Value("Regional Passport Office")
    private String name;

    @Autowired
    private PassportOfficer passportOfficer;
}
