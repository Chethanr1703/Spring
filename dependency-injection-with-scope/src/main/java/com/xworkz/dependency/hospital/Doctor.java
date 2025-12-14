package com.xworkz.dependency.hospital;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Doctor {

    private int id;
    private String doctorName;
}