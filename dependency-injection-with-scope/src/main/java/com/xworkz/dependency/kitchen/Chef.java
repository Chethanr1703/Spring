package com.xworkz.dependency.kitchen;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Chef {
    private  int id;
    private String chefName;
}
