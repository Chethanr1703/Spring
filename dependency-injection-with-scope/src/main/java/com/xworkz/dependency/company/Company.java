package com.xworkz.dependency.company;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Company {
    private  int companyId;
    private String companyName;

    @Autowired
    Employe employe;

}
