package com.xworkz.bean.dto;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class HospitalDTO {
    private int id;
    private String name;
    private String location;
    private String type;          // Government, Private
    private int totalBeds;
    private int icuBeds;
    private boolean emergencyAvailable;
    private String contactNo;
}
