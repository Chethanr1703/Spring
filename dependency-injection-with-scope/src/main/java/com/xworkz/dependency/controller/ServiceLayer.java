package com.xworkz.dependency.controller;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class ServiceLayer {

    private int id;
    private String name;
}