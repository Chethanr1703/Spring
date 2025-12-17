package com.xworkz.bankapp;


import com.xworkz.bankapp.config.Configuration;
import com.xworkz.bankapp.dto.BankDTO;
import com.xworkz.bankapp.service.BankService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        System.out.println("main started");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration.class);

        BankDTO bankDTO = new BankDTO(1,"Kotak","12345689","Bangalore",500);

        BankService bankService =applicationContext.getBean(BankService.class);
        boolean service =bankService.validateBankInfo(bankDTO);
        System.out.println(service);
        System.out.println("main Ended");
    }
}
