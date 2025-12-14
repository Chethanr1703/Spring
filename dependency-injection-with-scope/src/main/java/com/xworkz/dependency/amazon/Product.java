package com.xworkz.dependency.amazon;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Product {

    public Product() {
        System.out.println("Product zero para cons invok");
    }

    @Value("1")
    private int productId;
    @Value("Projector")
    private String productName;




    public Product(int id, String name) {
        System.out.println("Product para cons invoked");
        this.productId = id;
        this.productName = name;
    }
}
