package com.xworkz.modules.service.file;

import com.xworkz.modules.dao.fileDAO.FileDAO;
import com.xworkz.modules.entity.AddTeamEntity;
import com.xworkz.modules.entity.SignupEntity;
import com.xworkz.modules.entity.file.FileEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService{

    @Autowired
    FileDAO fileDAO;


    public FileEntity getFileById(int id) {
        return fileDAO.findById(id);
    }



    @Override
    public SignupEntity getUserEntityByEmail(String email) {
        return fileDAO.findEntityByEmail(email);
    }

    @Override
    public List<AddTeamEntity> getUserEntity() {
        return fileDAO.findEntity();
    }


}
