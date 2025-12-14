package com.xworkz.dependency.librarysh;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Library {
    private int id;
    private String name;

    @Autowired
    private Shelf shelf;
}
