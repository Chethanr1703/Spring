package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component

public class EmployeeDTO {
    private int empId;
    private String name;
    private String department;
    private String designation;
    private double salary;
    private long mobile;
    private String email;
    private String location;
}

