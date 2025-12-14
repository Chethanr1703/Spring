package com.xworkz.dependency.state;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class City {
    private int id;
    private String cityName;
}
