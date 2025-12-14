package com.xworkz.dependency.course;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Subject {
    private  int id;
    private String name;
}
