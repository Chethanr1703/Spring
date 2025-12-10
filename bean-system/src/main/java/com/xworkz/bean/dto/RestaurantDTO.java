package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter

public class RestaurantDTO {
    private int id;
    private String name;
    private String location;
    private String type;
    private double rating;
    private String cuisine;
    private boolean acAvailable;
    private boolean homeDelivery;
}
