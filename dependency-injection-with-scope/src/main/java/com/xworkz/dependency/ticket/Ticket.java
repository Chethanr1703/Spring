package com.xworkz.dependency.ticket;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope("prototype")
public class Ticket {
    private int id;
    private String name;

    @Autowired
    private Passenger passenger;
}

