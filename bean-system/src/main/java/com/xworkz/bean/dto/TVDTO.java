package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter

public class TVDTO {
    private int id;
    private String brand;
    private int sizeInInches;
    private String type;
    private double price;
    private String resolution;
    private boolean smart;
    private boolean available;
}
