package com.xworkz.forms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

    @NotNull(message = "Name is required")
    @Size(min = 1, message = "Name is required")
    private String name;

    @NotNull(message = "Email is required")
    @Email(message = "Invalid email")
    private String email;

    @Pattern(regexp = "[6-9][0-9]{9}", message = "Invalid phone number")
    private String phone;

    @Min(value = 18, message = "Age must be 18 or above")
    private int age;

    @NotNull(message = "College is required")
    @Size(min = 1, message = "College is required")
    private String college;

    @NotNull(message = "Branch is required")
    @Size(min = 1, message = "Branch is required")
    private String branch;

    @Min(value = 1, message = "Semester must be >= 1")
    private int semester;

    @NotNull(message = "City is required")
    @Size(min = 1, message = "City is required")
    private String city;


}
