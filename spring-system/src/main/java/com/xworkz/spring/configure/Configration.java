package com.xworkz.spring.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com,xworkz.spring")

public class Configration  {
    public Configration(){
        System.out.println("config invoked");
    }
}
