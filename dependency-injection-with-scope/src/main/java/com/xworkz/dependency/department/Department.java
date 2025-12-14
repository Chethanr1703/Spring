package com.xworkz.dependency.department;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Department {
    private int id;
    private String departmentName;

    @Autowired
    private DoctorDepartment doctor;
}