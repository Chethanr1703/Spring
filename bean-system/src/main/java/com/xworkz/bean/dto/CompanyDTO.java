package com.xworkz.bean.dto;
import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component


public class CompanyDTO {
    private int id;
    private String name;
    private String location;
    private String domain;
    private int totalEmployees;
    private double revenue;
    private String ceoName;
    private boolean active;
}
