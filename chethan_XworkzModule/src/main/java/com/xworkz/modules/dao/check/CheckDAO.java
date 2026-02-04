package com.xworkz.modules.dao.check;

import com.xworkz.modules.entity.SignupEntity;

public interface CheckDAO {
    SignupEntity checkPhoneNumber(String phone);
}
