package com.xworkz.dependency.exam;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope("prototype")
public class Exam {
    private  int id;
    private  String name;

    @Autowired
    private Result result;
}
