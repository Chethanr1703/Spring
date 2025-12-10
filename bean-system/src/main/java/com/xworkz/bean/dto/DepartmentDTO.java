package com.xworkz.bean.dto;
import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component

public class DepartmentDTO {
    private int id;
    private String name;
    private String hod;
    private int staffCount;
    private int studentCount;
    private String block;
    private String phone;
    private boolean active;
}
