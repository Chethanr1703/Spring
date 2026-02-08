package com.xworkz.modules.dao.fileDAO;

import com.xworkz.modules.entity.AddTeamEntity;
import com.xworkz.modules.entity.SignupEntity;
import com.xworkz.modules.entity.file.FileEntity;

import java.util.List;

public interface FileDAO {
    int saveFile(FileEntity entity);

    FileEntity findById(int id);

    SignupEntity findEntityByEmail(String email);

    List<AddTeamEntity> findEntity();

//    List<AddTeamEntity> findEntity();
}
