package com.xworkz.dependency.banklocker;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Assest {

    @Value("1")
   private int id;
}
