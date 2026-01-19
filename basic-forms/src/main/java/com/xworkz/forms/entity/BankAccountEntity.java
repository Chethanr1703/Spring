package com.xworkz.forms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String holderName;
    private String accountNo;
    private String ifsc;
    private String bankName;
    private String branch;
    private String aadhaar;
    private String pan;
    private Double balance;

}
