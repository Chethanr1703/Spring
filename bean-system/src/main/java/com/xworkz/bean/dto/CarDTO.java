package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter

public class CarDTO {
    private int id;
    private String brand;
    private String model;
    private String color;
    private double price;
    private String fuelType;
    private int seatingCapacity;
    private boolean available;
}
