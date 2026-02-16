package com.xworkz.modules.service.teamEmail;

import com.xworkz.modules.dto.AddTeamDTO;

import java.util.List;

public interface TeamEmailService {


    boolean sendMailToTeam(String teamName, String message);
}
