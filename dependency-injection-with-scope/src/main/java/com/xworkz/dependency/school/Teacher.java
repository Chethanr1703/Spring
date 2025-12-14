package com.xworkz.dependency.school;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Teacher {

    private int id;
    private String teacherName;
}