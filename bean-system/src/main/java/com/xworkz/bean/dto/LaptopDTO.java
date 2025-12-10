package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter

public class LaptopDTO {
    private int id;
    private String brand;
    private String model;
    private double price;
    private String processor;
    private int ram;
    private int storage;
    private boolean available;
}
