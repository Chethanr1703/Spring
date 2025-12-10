package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter

public class CourseDTO {
    private int id;
    private String courseName;
    private String instructor;
    private String mode;
    private String duration;
    private double fees;
    private String level;
    private boolean active;
}
