package com.xworkz.spring.basic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Basic {

    public int id;

    public String name;

    @Override
    public String toString() {
        return "Basic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
