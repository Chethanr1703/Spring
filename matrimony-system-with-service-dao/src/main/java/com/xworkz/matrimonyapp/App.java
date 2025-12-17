package com.xworkz.matrimonyapp;


import com.xworkz.matrimonyapp.config.Configuration;
import com.xworkz.matrimonyapp.dto.MatrimonyDTO;
import com.xworkz.matrimonyapp.service.MatrimonyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {
        System.out.println("main started");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration.class);
        MatrimonyDTO matrimonyDTO = new MatrimonyDTO("chethan@gmail.com","Friend",'M',"2003-08-17","Hindu","Kannada","Single",173);
        MatrimonyService matrimonyService=applicationContext.getBean(MatrimonyService.class);
        System.out.println("entering Service");
        matrimonyService.validate(matrimonyDTO);

        System.out.println("main ended");

    }
}
