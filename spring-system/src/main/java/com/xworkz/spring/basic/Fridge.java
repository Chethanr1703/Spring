package com.xworkz.spring.basic;

import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Setter
@ToString
@Component
public class Fridge {
    private int id;
    private String companyName;

}
