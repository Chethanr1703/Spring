package com.xworkz.dependency.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class ControllerLayer {
    private  int id;
    private String name;
    @Autowired
    private ServiceLayer serviceLayer;
}