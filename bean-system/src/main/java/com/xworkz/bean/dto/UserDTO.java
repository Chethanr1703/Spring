package com.xworkz.bean.dto;

import lombok.*;
import org.springframework.stereotype.Component;
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString

@Component
public class UserDTO {
    private  int id;
    private String firstName;
    private String lastName;
    private String email;
    private long phoneNo;
    private int age;
    private  String gender;
    private String address;
}
