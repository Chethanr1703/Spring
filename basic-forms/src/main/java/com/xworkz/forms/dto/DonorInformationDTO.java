package com.xworkz.forms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DonorInformationDTO {

    @NotNull(message = "Donor Name is required")
    @Size(min = 3, max = 50, message = "Donor Name must be 3-50 characters")
    private String donorName;

    @NotNull(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotNull(message = "Phone Number is required")
    @Digits(integer = 10, fraction = 0, message = "Phone number must be 10 digits")
    private Long phone;

    @NotNull(message = "Blood Group is required")
    private String bloodGroup;

    @NotNull(message = "Address is required")
    @Size(min = 5, max = 100, message = "Address must be 5-100 characters")
    private String address;

    @NotNull(message = "City is required")
    @Size(min = 2, max = 50, message = "City must be 2-50 characters")
    private String city;

    @NotNull(message = "State is required")
    @Size(min = 2, max = 50, message = "State must be 2-50 characters")
    private String state;

    @NotNull(message = "Country is required")
    @Size(min = 2, max = 50, message = "Country must be 2-50 characters")
    private String country;
}
