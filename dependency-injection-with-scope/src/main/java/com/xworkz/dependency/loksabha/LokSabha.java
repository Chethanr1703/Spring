package com.xworkz.dependency.loksabha;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class LokSabha {
    private int id;
    private String name;

    @Autowired
    private Seat seat;
}
