package com.xworkz.dependency.news;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class NewsChannel {

    public NewsChannel() {
        System.out.println("NewsChannel default cons invoked");
    }

    @Value("6")
    private int channelId;

    @Value("TV9")
    private String name;

    @Autowired
    private Reporter reporter;
}
