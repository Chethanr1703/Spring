package com.xworkz.spring.basic;

import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
@Setter
public class WashingMachine {
    private int id;
    private String companyName;

}
