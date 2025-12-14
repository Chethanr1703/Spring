package com.xworkz.dependency.bank;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Account {

    private int id;
    private String name;
}