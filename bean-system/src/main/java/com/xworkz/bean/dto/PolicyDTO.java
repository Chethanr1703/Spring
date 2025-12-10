package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component

public class PolicyDTO {
    private int id;
    private String policyNumber;
    private String policyName;
    private String policyType;
    private double premiumAmount;
    private int duration;
    private String insuredPerson;
    private boolean active;
}