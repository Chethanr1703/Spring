package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Setter
@Getter@AllArgsConstructor
@ToString
@Component
public class FanDTO {
    private  int id ;
    private String companyName;
    private String modelNo;
    private double price;
    private String color;
    private int noOfWings;
    private String warrenty;
    private boolean isPortable;


}
