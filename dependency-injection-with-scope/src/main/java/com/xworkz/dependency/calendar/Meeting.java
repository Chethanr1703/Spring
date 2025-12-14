package com.xworkz.dependency.calendar;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope("prototype")
public class Meeting {
    private int id;
    private String meetingTitle;


}
