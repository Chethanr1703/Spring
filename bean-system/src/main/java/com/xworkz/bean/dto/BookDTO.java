package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter

public class BookDTO {
    private int id;
    private String title;
    private String author;
    private String category;
    private double price;
    private String publisher;
    private int pages;
    private boolean available;
}