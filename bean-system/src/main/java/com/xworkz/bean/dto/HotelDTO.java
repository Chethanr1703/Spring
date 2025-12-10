package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter

public class HotelDTO {
    private int id;
    private String name;
    private String location;
    private String type;
    private double pricePerNight;
    private double rating;
    private boolean wifiAvailable;
    private boolean breakfastIncluded;
}
