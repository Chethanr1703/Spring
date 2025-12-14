package com.xworkz.dependency.book;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope("prototype")
public class BookSeller {
    private int id;
    private  String name;

    Book book;

}
