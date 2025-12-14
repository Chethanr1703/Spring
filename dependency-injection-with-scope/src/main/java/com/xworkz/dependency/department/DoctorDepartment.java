package com.xworkz.dependency.department;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class DoctorDepartment {
    private int id;
    private String doctorName;
}
