package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
@Component

public class StudentDTO {
    private int id;
    private String name;
    private String course;
    private String college;
    private int age;
    private double marks;
    private long mobile;
    private String city;
}

