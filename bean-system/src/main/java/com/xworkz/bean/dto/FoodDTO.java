package com.xworkz.bean.dto;


import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter


public class FoodDTO {
    private int id;
    private String name;
    private String type;
    private String category;
    private double price;
    private boolean spicy;
    private String cuisine;
    private boolean available;
}
