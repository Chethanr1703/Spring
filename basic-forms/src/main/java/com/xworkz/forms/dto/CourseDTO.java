package com.xworkz.forms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {

    @NotNull(message = "Course name is required")
    @Size(min = 2, max = 50, message = "Course name must be 2-50 characters")
    private String name;

    @NotNull(message = "Course code is required")
    @Size(min = 2, max = 10, message = "Course code must be 2-10 characters")
    private String code;

    @NotNull(message = "Duration is required")
    @Size(min = 2, max = 20, message = "Duration must be 2-20 characters")
    private String duration;

    @NotNull(message = "Instructor name is required")
    @Size(min = 2, max = 50, message = "Instructor name must be 2-50 characters")
    private String instructor;

    @NotNull(message = "Category is required")
    @Size(min = 2, max = 30, message = "Category must be 2-30 characters")
    private String category;

    @NotNull(message = "Level is required")
    @Size(min = 2, max = 20, message = "Level must be 2-20 characters")
    private String level;

    @NotNull(message = "Fees are required")
    @DecimalMin(value = "0.01", message = "Fees must be greater than 0")
    private Double fees;
}