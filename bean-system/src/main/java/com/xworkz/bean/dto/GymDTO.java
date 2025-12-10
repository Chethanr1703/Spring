package com.xworkz.bean.dto;
import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component

public class GymDTO {
    private int id;
    private String name;
    private String location;
    private double monthlyFee;
    private String trainerName;
    private boolean acAvailable;
    private String openingTime;
    private boolean active;
}
