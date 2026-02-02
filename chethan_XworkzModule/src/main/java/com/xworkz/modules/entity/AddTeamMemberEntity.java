package com.xworkz.modules.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TeamMember_Details")
@Entity

public class AddTeamMemberEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String name;
        private String email;

        private String phone;
        private String teamName;
        private String teamHeadEmail;



}
