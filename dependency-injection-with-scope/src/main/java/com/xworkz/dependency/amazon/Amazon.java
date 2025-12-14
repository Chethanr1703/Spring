package com.xworkz.dependency.amazon;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
@Scope("prototype")
public class Amazon {

    public Amazon(){
        System.out.println("Amazon default cons invoked" );
    }
    @Value("1")
    private int amazonId ;

    @Autowired
    Product product;


}
