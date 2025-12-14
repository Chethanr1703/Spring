package com.xworkz.dependency.contacts;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class PhoneBookContact {
    private int id;
    private String phoneBookName;

    @Autowired
    private Contact contact;
}
