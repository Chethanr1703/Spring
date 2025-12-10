package com.xworkz.bean.dto;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class TicketDTO {
    private int id;
    private String type;
    private String fromLocation;
    private String toLocation;
    private double price;
    private String date;
    private String time;
    private String status;
}
