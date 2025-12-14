package com.xworkz.dependency.kitchen;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Kitchen {

    private  int id;
    private String name;

    @Autowired
    private Chef chef;
}