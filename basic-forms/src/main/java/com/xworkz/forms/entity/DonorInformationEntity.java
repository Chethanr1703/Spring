package com.xworkz.forms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DonorInformationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String donorName;
    private String email;
    private Long phone;
    private String bloodGroup;
    private String address;
    private String city;
    private String state;
    private String country;
}
