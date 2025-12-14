package com.xworkz.dependency.course;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Data
@Component
public class Course {
    private  int id;
    private String name;

    @Autowired
    private Subject subject;
}
