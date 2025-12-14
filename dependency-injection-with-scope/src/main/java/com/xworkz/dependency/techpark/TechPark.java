package com.xworkz.dependency.techpark;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class TechPark {
    private int id;
    private String name;

    @Autowired
    private TechBlock block;
}
