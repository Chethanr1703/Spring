package com.xworkz.dependency.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.dependency")
public class CoreConfigure {

    public CoreConfigure(){
        System.out.println("core configure is invoked");
    }
}
