package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
@Component
public class ProductDTO {
    private int id;
    private String name;
    private String brand;
    private String category;
    private double price;
    private int quantity;
    private String color;
    private boolean available;
}

