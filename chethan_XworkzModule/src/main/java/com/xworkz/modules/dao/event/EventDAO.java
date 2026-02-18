package com.xworkz.modules.dao.event;

import com.xworkz.modules.entity.event.TeamEventEntity;
import com.xworkz.modules.entity.event.TeamEventResponseEntity;

import java.util.List;

public interface EventDAO {
    boolean saveEvent(TeamEventEntity event);

    boolean saveEventResponse(TeamEventResponseEntity response);

//    TeamEventEntity getEventById(int id);

    TeamEventResponseEntity findResponse(int eventId, String email);




}
