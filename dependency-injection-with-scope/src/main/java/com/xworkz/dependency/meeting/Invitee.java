package com.xworkz.dependency.meeting;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Invitee {
    private int id;
    private String inviteeName;
}
