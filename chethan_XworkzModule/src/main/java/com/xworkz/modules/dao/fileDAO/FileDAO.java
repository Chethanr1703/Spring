package com.xworkz.modules.dao.fileDAO;

import com.xworkz.modules.entity.SignupEntity;
import com.xworkz.modules.entity.file.FileEntity;

public interface FileDAO {
    int saveFile(FileEntity entity);

    FileEntity findById(int id);

    SignupEntity findEntityByEmail(String email);
}
