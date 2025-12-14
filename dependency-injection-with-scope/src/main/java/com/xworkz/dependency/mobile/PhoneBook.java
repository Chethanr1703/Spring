package com.xworkz.dependency.mobile;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class PhoneBook {
    private int id;
    private String phoneBookName;

}

