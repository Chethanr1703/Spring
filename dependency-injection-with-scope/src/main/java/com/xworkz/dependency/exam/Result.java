package com.xworkz.dependency.exam;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Result {

    private  int id;
    private String  resultName;
}
