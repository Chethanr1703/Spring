package com.xworkz.modules.service;

import com.xworkz.modules.dto.AddTeamDTO;
import com.xworkz.modules.dto.AddTeamMemberDTO;
import com.xworkz.modules.dto.SignupDTO;
import com.xworkz.modules.exception.UserNotFounException;

import java.util.List;

public interface ModuleService {

    boolean validateAndSave(SignupDTO signupDTO);

    SignupDTO validateLogin(String email, String password) throws UserNotFounException;

    void setCountToZero(String email);

    int getCount(String email);

    void updateCount(String email);

    boolean sendOtp(String email);

    boolean checkOptLogin(String email, String otp);

    boolean validateNewPassword(String email,String newPassword, String confirmPassword);

    boolean saveTeam( AddTeamDTO addTeamDTO);

    boolean addTeamMember(AddTeamMemberDTO addTeamMemberDTO);

    List<AddTeamDTO> getTeam();

    List<AddTeamMemberDTO> getTeamMemberByTeamName(String teamName);

    SignupDTO checkEmail(String email);
}
