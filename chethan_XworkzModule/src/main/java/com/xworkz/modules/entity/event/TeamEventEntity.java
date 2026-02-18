package com.xworkz.modules.entity.event;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "team_event")
public class TeamEventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String teamName;

    private String title;

    @Column(length = 2000)
    private String description;

    private LocalDateTime createdAt = LocalDateTime.now();

}

