package com.xworkz.modules.service;

import com.xworkz.modules.dao.ProfileDAO;
import com.xworkz.modules.dto.SignupDTO;
import com.xworkz.modules.entity.SignupEntity;
import com.xworkz.modules.utils.PasswordUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService{

    @Autowired
    ProfileDAO profileDAO;

    @Autowired
    PasswordUtil passwordUtil;

    @Override
    public boolean updateProfile(String email, String phone, int age, String address) {
        return profileDAO.updateProfile(email, phone, age, address);

    }

    @Override
    public SignupDTO getUserByEmail(String email) {
        SignupEntity signupEntity=profileDAO.findByEmail(email);
        SignupDTO signupDTO = new SignupDTO();
        BeanUtils.copyProperties(signupEntity,signupDTO);

        return signupDTO;
    }

    @Override
    public String changePassword(String email, String newPassword, String confirmPassword) {
        if (!newPassword.equals(confirmPassword)) {
            return "New password and confirm password do not match";
        }
        String encryptedPwd = passwordUtil.encrypt(newPassword);
        boolean updated = profileDAO.updatePasswordByEmail(email, encryptedPwd);

        if (!updated) {
            return "Password update failed. Try again.";
        }
        return "SUCCESS";
    }


}
