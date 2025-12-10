package com.xworkz.spring.basic;

import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString@Setter
@Component
public class Shoe {
    private int id;
    private String companyName;

}
