package com.xworkz.dependency.floor;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope("prototype")
public class Room {
    private  int id;
    private  String type;


}
