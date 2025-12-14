package com.xworkz.dependency.hotel;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data

@Scope("prototype")
public class RoomHotel {
    private  int roomNo;
    private int NoOfBed;
}
