package com.xworkz.customerapp.config;

import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = "com.xworkz.customerapp")
public class Configuration {
    public Configuration(){
        System.out.println("config is invoked");
    }
}
