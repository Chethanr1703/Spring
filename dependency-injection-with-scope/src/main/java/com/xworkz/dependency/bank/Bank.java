package com.xworkz.dependency.bank;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Bank {

    private int id;
    private String bankName;
    @Autowired
    private Account account;
}
