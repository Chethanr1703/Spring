package com.xworkz.modules.service.teamEmail;

import com.xworkz.modules.dto.AddTeamDTO;

import java.util.List;

public interface TeamEmailService {


    boolean createEventAndSendMail(String teamName, String title, String message);

    boolean saveResponse(int eventId, String email, String response);


}
