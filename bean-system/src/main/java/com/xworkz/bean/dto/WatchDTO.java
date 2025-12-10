package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter

public class WatchDTO {
    private int id;
    private String brand;
    private String type;
    private String color;
    private double price;
    private boolean waterResistant;
    private String strapMaterial;
    private boolean digital;
}
