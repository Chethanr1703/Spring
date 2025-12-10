package com.xworkz.spring.basic;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@ToString
@Setter
@Component
public class SevPuri {
    private int id;
    private Double price;
}
