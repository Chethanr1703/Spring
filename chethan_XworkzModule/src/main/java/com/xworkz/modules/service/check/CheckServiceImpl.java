package com.xworkz.modules.service.check;

import com.xworkz.modules.dao.check.CheckDAO;
import com.xworkz.modules.dto.SignupDTO;
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
}
