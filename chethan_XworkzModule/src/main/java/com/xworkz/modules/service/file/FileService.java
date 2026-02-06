package com.xworkz.modules.service.file;

import com.xworkz.modules.entity.SignupEntity;
import com.xworkz.modules.entity.file.FileEntity;

public interface FileService {
    FileEntity getFileById(int id);

    SignupEntity getUserEntityByEmail(String email);
}
