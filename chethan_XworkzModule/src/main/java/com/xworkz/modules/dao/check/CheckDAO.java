package com.xworkz.modules.dao.check;

import com.xworkz.modules.entity.AddTeamEntity;
import com.xworkz.modules.entity.AddTeamMemberEntity;
import com.xworkz.modules.entity.SignupEntity;

public interface CheckDAO {
    SignupEntity checkPhoneNumber(String phone);

    boolean checkEmail(String email);

    AddTeamEntity checkTeamheadPhoneNumber(String phone);

    boolean checkTeamHeadEmail(String email);

    AddTeamMemberEntity checkTeamMemberPhoneNumber(String phone);

    boolean checkTeamMemberEmail(String email);
}
