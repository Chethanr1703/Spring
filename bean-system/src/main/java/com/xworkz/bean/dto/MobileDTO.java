package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter

public class MobileDTO {
    private int id;
    private String brand;
    private String model;
    private double price;
    private int ram;
    private int storage;
    private String os;
    private boolean available;
}
