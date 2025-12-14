package com.xworkz.dependency.book;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Book {
    private int id;
    private String bookName;

}
