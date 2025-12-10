package com.xworkz.bean.dto;
import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component

public class AccountDTO {
    private int id;
    private String accountNumber;
    private String accountType;
    private String holderName;
    private double balance;
    private String branch;
    private boolean kycCompleted;
    private boolean active;
}
