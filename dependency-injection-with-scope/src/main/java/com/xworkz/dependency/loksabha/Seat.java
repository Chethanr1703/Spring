package com.xworkz.dependency.loksabha;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Seat {
    private int id;
    private String seatNumber;


}
