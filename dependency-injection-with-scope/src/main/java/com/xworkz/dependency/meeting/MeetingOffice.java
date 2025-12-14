package com.xworkz.dependency.meeting;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class MeetingOffice {
    private int id;
    private String meetingTitle;

    @Autowired
    private Invitee invitee;
}
