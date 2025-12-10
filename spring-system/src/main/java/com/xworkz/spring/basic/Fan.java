package com.xworkz.spring.basic;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ToString
@Component
public class Fan {
    private int id;
    private String companyName;


}
