package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter

public class ShoesDTO {
    private int id;
    private String brand;
    private String type;
    private int size;
    private String color;
    private double price;
    private String gender;
    private boolean inStock;
}

