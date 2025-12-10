package com.xworkz.bean.dto;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class FlightDTO {
    private int id;
    private String flightNo;
    private String airline;
    private String source;
    private String destination;
    private double fare;
    private String departureTime;
    private boolean available;
}
