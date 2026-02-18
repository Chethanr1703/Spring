package com.xworkz.modules.entity.event;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "team_event_response")
public class TeamEventResponseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int eventId;

    private String memberEmail;

    private String response;   // ATTENDING / NOT_ATTENDING

    private LocalDateTime respondedAt = LocalDateTime.now();
}

