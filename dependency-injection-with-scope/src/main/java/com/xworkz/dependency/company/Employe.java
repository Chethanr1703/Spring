package com.xworkz.dependency.company;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Employe {
    private  int id;
    private String name;
}
