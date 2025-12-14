package com.xworkz.dependency.magazine;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Page {
    private int id;
    private String pageNumber;


}
