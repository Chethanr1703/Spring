package com.xworkz.forms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAccountDTO {

    @NotNull(message = "Holder Name is required")
    @Size(min = 3, max = 30, message = "Holder Name must be 3-30 characters")
    private String holderName;

    @NotNull(message = "Account Number is required")
    @Size(min = 9, max = 18, message = "Account Number must be 9-18 digits")
    @Pattern(regexp = "^[0-9]+$", message = "Account Number must contain only digits")
    private String accountNo;

    @NotNull(message = "IFSC is required")
    @Size(min = 11, max = 11, message = "IFSC must be 11 characters")
    private String ifsc;

    @NotNull(message = "Bank Name is required")
    @Size(min = 3, max = 30, message = "Bank Name must be 3-30 characters")
    private String bankName;

    @NotNull(message = "Branch is required")
    @Size(min = 3, max = 30, message = "Branch must be 3-30 characters")
    private String branch;

    @NotNull(message = "Aadhaar is required")
    @Size(min = 12, max = 12, message = "Aadhaar must be 12 digits")
    @Pattern(regexp = "^[0-9]{12}$", message = "Aadhaar must contain only digits")
    private String aadhaar;

    @NotNull(message = "PAN is required")
    @Size(min = 10, max = 10, message = "PAN must be 10 characters")
    @Pattern(regexp = "^[A-Z]{5}[0-9]{4}[A-Z]$", message = "Invalid PAN format")
    private String pan;

    @NotNull(message = "Balance is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Balance must be greater than 0")
    private Double balance;

}
