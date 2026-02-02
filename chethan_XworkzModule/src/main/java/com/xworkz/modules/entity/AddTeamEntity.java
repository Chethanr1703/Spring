package com.xworkz.modules.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Teams_Details")
@Entity
public class AddTeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String teamName;
    private String teamHeadName;
    private String email;
    private String phone;
    private Integer noOfTeamMember;
}
