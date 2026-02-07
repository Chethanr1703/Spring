package com.xworkz.modules.service.check;

import com.xworkz.modules.dto.AddTeamDTO;
import com.xworkz.modules.dto.AddTeamMemberDTO;
import com.xworkz.modules.dto.SignupDTO;

public interface CheckService {
    SignupDTO checkPhoneNumber(String phone);

    boolean checkEmail(String email);

     AddTeamDTO checkTeamHeadPhoneNo(String phone);

    boolean checkTeamEmail(String email);

    AddTeamMemberDTO checkTeamMemberPhoneNo(String phone);

    boolean checkTeamMemberEmail(String email);
}
