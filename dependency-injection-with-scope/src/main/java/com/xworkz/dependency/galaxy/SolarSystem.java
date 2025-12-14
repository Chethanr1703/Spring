package com.xworkz.dependency.galaxy;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class SolarSystem {
    private int id;
    private String systemName;

}
