package com.xworkz.modules.dao;

import com.xworkz.modules.dto.AddTeamDTO;
import com.xworkz.modules.entity.AddTeamEntity;
import com.xworkz.modules.entity.AddTeamMemberEntity;
import com.xworkz.modules.entity.SignupEntity;
import com.xworkz.modules.entity.file.FileEntity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

public interface ModuleDAO {
    boolean save(SignupEntity signupEntity);

    SignupEntity loginByEmail(String email);

    void setCountToZero(String email);

    int getCount(String email);

    void updateCount(String email);

    boolean checkEmail(@NotNull(message =" Email is required") @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@gmail\\.com$",message = "email is not valid") String email);

    boolean saveOtp(String email, String otp);

    boolean checkOtpMatch(String email, String otp);

    boolean updateNewPassword(String email, String encryptedPassword);

    boolean saveTeam(AddTeamEntity addTeamEntity);

    AddTeamEntity findByTeamHeadEmail(@Pattern(regexp = "^[a-zA-Z0-9._%+-]+@gmail\\.com$",message = "email is not valid") String teamHeadEmail);

    boolean saveTeamMember(AddTeamMemberEntity entity);

    List<AddTeamEntity> getTeamByTeamHeadEmail();

    int countTeamMembers(String teamName, String email);

    List<AddTeamMemberEntity> getTeamMemberByTeamName(String teamName);

    boolean saveProfileImage(FileEntity imageEntity);
}
