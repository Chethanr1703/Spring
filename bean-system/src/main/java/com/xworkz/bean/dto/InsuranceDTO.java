package com.xworkz.bean.dto;
import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component

public class InsuranceDTO {
    private int id;
    private String policyType;
    private String companyName;
    private double premium;
    private double coverageAmount;
    private int tenure;
    private String holderName;
    private boolean active;
}
