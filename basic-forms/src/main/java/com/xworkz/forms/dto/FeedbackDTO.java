package com.xworkz.forms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackDTO {

    @NotNull(message = "Name is required")
    @Size(min = 3, max = 30, message = "Name must be 3 to 30 characters")
    private String name;

    @NotNull(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotNull(message = "Phone is required")
    @Pattern(regexp = "^[6-9][0-9]{9}$", message = "Invalid phone number")
    private String phone;

    @NotNull(message = "Subject is required")
    @Size(min = 3, max = 40, message = "Subject must be 3 to 40 characters")
    private String subject;

    @NotNull(message = "Rating is required")
    @Min(value = 1, message = "Rating must be at least 1")
    @Max(value = 5, message = "Rating must be at most 5")
    private Integer rating;

    @NotNull(message = "Message is required")
    @Size(min = 5, max = 200, message = "Message must be 5 to 200 characters")
    private String message;
}
