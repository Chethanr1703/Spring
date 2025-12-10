package com.xworkz.spring.basic;

import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Setter
@ToString

public class Laptop {
    private int id;
    private String companyName;

}
