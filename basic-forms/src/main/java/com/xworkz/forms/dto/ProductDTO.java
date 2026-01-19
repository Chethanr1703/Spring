package com.xworkz.forms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    @NotNull(message = "Product name is required")
    @Size(min = 2, max = 50, message = "Product name must be 2-50 characters")
    private String name;

    @NotNull(message = "Brand is required")
    @Size(min = 2, max = 30, message = "Brand must be 2-30 characters")
    private String brand;

    @NotNull(message = "Category is required")
    @Size(min = 2, max = 30, message = "Category must be 2-30 characters")
    private String category;

    @NotNull(message = "Price is required")
    @DecimalMin(value = "0.01", message = "Price must be greater than 0")
    private Double price;

    @NotNull(message = "Quantity is required")
    @Min(value = 1, message = "Quantity must be at least 1")
    private Integer quantity;

    @NotNull(message = "Warranty is required")
    @Size(min = 2, max = 20, message = "Warranty must be 2-20 characters")
    private String warranty;

    @NotNull(message = "Color is required")
    @Size(min = 2, max = 20, message = "Color must be 2-20 characters")
    private String color;

    @NotNull(message = "Description is required")
    @Size(min = 5, max = 200, message = "Description must be 5-200 characters")
    private String description;

}
