package com.xworkz.bean.dto;
import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component

public class TrainerDTO {
    private int id;
    private String name;
    private String skill;
    private int experience;
    private double salary;
    private long mobile;
    private String email;
    private boolean active;
}
