package com.xworkz.dependency.banklocker;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class BankLocker {

    public BankLocker() {
        System.out.println("BankLocker default cons invoked");
    }

    @Value("8")
    private int lockerId;

    @Value("Steel Locker")
    private String model;

    @Autowired
    private Assest assests;
}
