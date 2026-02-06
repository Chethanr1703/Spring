package com.xworkz.modules.entity;

import com.xworkz.modules.entity.file.FileEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "SignUp_Details")
public class SignupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String name;

    private String email;
    private String phone;
    private Integer age;
    private String gender;
    private String address;
    private String password;
    int count;
    private String otp;
    @Column(name = "otp_time")
    private LocalDateTime otpTime;

    @OneToOne
    @JoinColumn(name = "file_id")
    private FileEntity profileImage;

}
