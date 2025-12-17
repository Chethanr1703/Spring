package com.xworkz.bankapp.service.impl;

import com.xworkz.bankapp.dao.BankDAO;
import com.xworkz.bankapp.dto.BankDTO;
import com.xworkz.bankapp.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankServiceImpl implements BankService {

    @Autowired
    BankDAO bankDAO;


    @Override
    public boolean validateBankInfo(BankDTO bankDTO) {
        
        boolean validate = true;
        if(bankDTO.getBankId()<0){
            validate=false;
        } else if (bankDTO.getBankName().length()<3) {
            validate=false;
        } else if (bankDTO.getIfscCode().length()<5) {
            validate=false;
        } else if (bankDTO.getLocation().length()<4) {
            validate=false;
        } else if (bankDTO.getNoOfCustomer()<0) {
            validate=false;
        }

        if(validate){
            bankDAO.save(bankDTO);
            System.out.println("saving ");
        }
        return validate;
    }
}
