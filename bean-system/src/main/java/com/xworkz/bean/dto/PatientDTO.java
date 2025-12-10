package com.xworkz.bean.dto;
import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component

public class PatientDTO {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String disease;
    private String doctorName;
    private long mobile;
    private String admissionDate;
}
