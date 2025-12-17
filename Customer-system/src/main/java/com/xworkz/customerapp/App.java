package com.xworkz.customerapp;

import com.xworkz.customerapp.config.Configuration;
import com.xworkz.customerapp.dto.CustomerInfoDTO;
import com.xworkz.customerapp.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration.class);
        CustomerInfoDTO customerInfoDTO = new CustomerInfoDTO("Chethan",9632027324l,"chethan12@gmail.com","laggere");
        CustomerService customerService=applicationContext.getBean(CustomerService.class);

        customerService.validateAndSave(customerInfoDTO);
    }
}
