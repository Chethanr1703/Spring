package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter

public class MovieDTO {
    private int id;
    private String name;
    private String language;
    private String genre;
    private double rating;
    private int durationMinutes;
    private String director;
    private boolean released;
}
