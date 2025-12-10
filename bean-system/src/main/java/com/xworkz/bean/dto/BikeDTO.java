package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter

public class BikeDTO {
    private int id;
    private String brand;
    private String model;
    private int engineCC;
    private double price;
    private String color;
    private String type;
    private boolean available;
}
