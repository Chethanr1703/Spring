package com.xworkz.dependency.director;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Movie {

    public Movie() {
        System.out.println("Movie default cons invoked");
    }

    @Value("10")
    private int movieId;

    @Value("Baahubali")
    private String title;

    @Autowired
    Director director;
}
