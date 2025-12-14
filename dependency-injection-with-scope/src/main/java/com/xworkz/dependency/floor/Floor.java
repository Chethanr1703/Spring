package com.xworkz.dependency.floor;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Floor {

    private int noOfFloor;

    @Autowired
    Room room;
}
