package com.xworkz.modules.service.check;

import com.xworkz.modules.dao.check.CheckDAO;
import com.xworkz.modules.dto.AddTeamDTO;
import com.xworkz.modules.dto.AddTeamMemberDTO;
import com.xworkz.modules.dto.SignupDTO;
import com.xworkz.modules.entity.AddTeamEntity;
import com.xworkz.modules.entity.AddTeamMemberEntity;
import com.xworkz.modules.entity.SignupEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class CheckServiceImpl implements CheckService{


    @Autowired
    CheckDAO checkDAO;


    @Override
    public SignupDTO checkPhoneNumber(String phone) {
        if(phone!=null && phone.length()==10) {
            SignupEntity signupEntity = checkDAO.checkPhoneNumber(phone);
            if(signupEntity!=null){
                SignupDTO signupDTO = new SignupDTO();
                BeanUtils.copyProperties(signupEntity,signupDTO);
                return signupDTO;
            }
        }
        return null;
    }

    @Override
    public AddTeamDTO checkTeamHeadPhoneNo(String phone) {
        if(phone!=null && phone.length()==10) {
            AddTeamEntity addTeamEntity = checkDAO.checkTeamheadPhoneNumber(phone);
            if(addTeamEntity!=null){
                AddTeamDTO addTeamDTO = new AddTeamDTO();
                BeanUtils.copyProperties(addTeamEntity,addTeamDTO);
                return addTeamDTO;
            }
        }
        return null;
    }




    @Override
    public boolean checkEmail(String email) {
        if(email!=null){
            boolean isAvaliable= checkDAO.checkEmail(email);
            return isAvaliable;
        }
        return false;
    }


    @Override
    public boolean checkTeamEmail(String email) {
        if(email!=null){
            boolean isAvaliable= checkDAO.checkTeamHeadEmail(email);
            return isAvaliable;
        }
        return false;
    }

    @Override
    public AddTeamMemberDTO checkTeamMemberPhoneNo(String phone) {
        if(phone!=null && phone.length()==10) {
            AddTeamMemberEntity addTeamEntity = checkDAO.checkTeamMemberPhoneNumber(phone);
            if(addTeamEntity!=null){
                AddTeamMemberDTO addTeamDTO = new AddTeamMemberDTO();
                BeanUtils.copyProperties(addTeamEntity,addTeamDTO);
                return addTeamDTO;
            }
        }
        return null;
    }

    @Override
    public boolean checkTeamMemberEmail(String email) {

        if(email!=null){
            boolean isAvaliable= checkDAO.checkTeamMemberEmail(email);
            return isAvaliable;
        }
        return false;
    }
}
