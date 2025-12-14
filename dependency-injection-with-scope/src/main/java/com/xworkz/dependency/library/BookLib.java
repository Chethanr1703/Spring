package com.xworkz.dependency.library;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class BookLib {

    private int id;
    private String bookName;
}