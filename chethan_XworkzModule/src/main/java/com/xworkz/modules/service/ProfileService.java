package com.xworkz.modules.service;

import com.xworkz.modules.dto.SignupDTO;
import com.xworkz.modules.entity.SignupEntity;

public interface ProfileService {
    boolean updateProfile(String email, String phone, int age, String address);

    SignupDTO getUserByEmail(String email);
    String changePassword(String email, String newPassword, String confirmPassword);
}
