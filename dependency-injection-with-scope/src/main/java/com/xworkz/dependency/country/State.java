package com.xworkz.dependency.country;

import com.xworkz.dependency.state.City;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class State {
    private int id;
    private String stateName;

    @Autowired
    private City city;
}
