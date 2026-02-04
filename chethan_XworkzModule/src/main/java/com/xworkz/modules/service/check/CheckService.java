package com.xworkz.modules.service.check;

import com.xworkz.modules.dto.SignupDTO;

public interface CheckService {
    SignupDTO checkPhoneNumber(String phone);
}
