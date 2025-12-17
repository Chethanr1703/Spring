package com.xworkz.bankapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankDTO {
    private int bankId;
    private String bankName;
    private String ifscCode;
    private String location;
    private int noOfCustomer;
}
