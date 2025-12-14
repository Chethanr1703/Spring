package com.xworkz.dependency.postoffice;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class PostOffice {

    public PostOffice() {
        System.out.println("PostOffice default cons invoked");
    }

    @Value("8")
    private int officeId;

    @Value("Head Post Office")
    private String type;

    @Autowired
    private Postman postman;
}
