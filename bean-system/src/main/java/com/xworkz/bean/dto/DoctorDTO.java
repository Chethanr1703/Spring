package com.xworkz.bean.dto;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class DoctorDTO {
    private int id;
    private String name;
    private String specialization;
    private int experience;
    private String hospitalName;
    private long mobile;
    private String email;
    private boolean available;
}
