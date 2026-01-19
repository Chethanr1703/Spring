package com.xworkz.forms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobApplicationDTO {

    @NotNull(message = "First Name is required")
    @Size(min = 2, max = 30, message = "First Name must be 2-30 characters")
    private String firstName;

    @NotNull(message = "Last Name is required")
    @Size(min = 2, max = 30, message = "Last Name must be 2-30 characters")
    private String lastName;

    @NotNull(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotNull(message = "Phone Number is required")
    @Digits(integer = 10, fraction = 0, message = "Phone number must be 10 digits")
    private Long phoneNo;

    @NotNull(message = "Date of Birth is required")
    private String dob;

    @NotNull(message = "Gender is required")
    private String gender;

    @NotNull(message = "Qualification is required")
    private String qualification;

    @NotNull(message = "Experience is required")
    @Size(max = 50, message = "Experience description is too long")
    private String experience;
}
