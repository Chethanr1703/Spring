package com.xworkz.dependency.ticket;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Passenger {

    private int id;
    private String passengerName;
}