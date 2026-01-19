package com.xworkz.forms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventRegistrationDTO {

    @NotNull(message = "Name is required")
    @Size(min = 3, max = 30, message = "Name must be 3-30 characters")
    private String name;

    @NotNull(message = "Email is required")
    @Size(min = 5, max = 50, message = "Email must be 5-50 characters")
    private String email;

    @NotNull(message = "Phone is required")
    @Size(min = 10, max = 10, message = "Phone must be 10 digits")
    private String phone;

    @NotNull(message = "Event Name is required")
    @Size(min = 3, max = 40, message = "Event Name must be 3-40 characters")
    private String eventName;

    @NotNull(message = "Location is required")
    @Size(min = 3, max = 40, message = "Location must be 3-40 characters")
    private String location;

    @NotNull(message = "Date is required")
    @Size(min = 1, message = "Date is required")
    private String date;

}
