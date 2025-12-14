package com.xworkz.dependency.hotel;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Hotel {
    private int hotelId;
    private String hotelName;

    @Autowired
    RoomHotel room;
}
