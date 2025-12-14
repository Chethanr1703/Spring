package com.xworkz.dependency.contacts;

import lombok.Data;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Contact {
    private int id;
    private String contactName;
}
