package com.xworkz.modules.dao;

import com.xworkz.modules.entity.SignupEntity;

public interface ProfileDAO {
    boolean updateProfile(String email, String phone, int age, String address);

    SignupEntity findByEmail(String email);
    boolean updatePasswordByEmail(String email, String newPassword);
}
