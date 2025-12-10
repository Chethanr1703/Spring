package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter

public class RoomDTO {
    private int id;
    private int roomNo;
    private String type;
    private double pricePerNight;
    private boolean ac;
    private boolean available;
    private int floor;
    private String bedType;
}
