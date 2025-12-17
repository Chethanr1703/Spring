package com.xworkz.matrimonyapp.service.impl;

import com.xworkz.matrimonyapp.dao.MatrimonyDAO;
import com.xworkz.matrimonyapp.dto.MatrimonyDTO;
import com.xworkz.matrimonyapp.service.MatrimonyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MatrimonyServiceImpl implements MatrimonyService {

    @Autowired
    MatrimonyDAO matrimonyDAO;


    @Override
    public boolean validate(MatrimonyDTO matrimonyDTO) {
        System.out.println("Service");
        boolean validate= true;
        if (matrimonyDTO.getEmail()==null){
            validate=false;
        } else if (matrimonyDTO.getForWhom()==null) {
            validate=false;
        } else if (String.valueOf(matrimonyDTO.getGender()).length()<1) {
            validate=false;
        } else if (matrimonyDTO.getDob()==null) {
            validate=false;
        }
        else if (matrimonyDTO.getReligion()==null) {
            validate=false;
        }
        else if (matrimonyDTO.getMotherTongue()==null){
            validate=false;
        }else if(matrimonyDTO.getMartialStatus()==null){
            validate=false;
        } else if (matrimonyDTO.getHeight()<100) {
            validate=false;
        }
        if (validate){
            System.out.println("entering DAO");
matrimonyDAO.save(matrimonyDTO);
        }

        return true;
    }
}
