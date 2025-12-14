package com.xworkz.dependency.collage;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Student {

    private int id;
    private String name;
}