package com.xworkz.customerapp.service;

import com.xworkz.customerapp.dao.CustomerDAO;
import com.xworkz.customerapp.dto.CustomerInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerDAO customerDAO;
    @Override
    public boolean validateAndSave(CustomerInfoDTO customerInfoDTO) {


        boolean validate = true;
        if(customerInfoDTO.getName()==null){
            validate= false;
        } else if (String.valueOf(customerInfoDTO.getPhoneNo()).length()!=10) {
            validate=false;
        } else if (customerInfoDTO.getEmail()==null) {
            validate=false;

        } else if (customerInfoDTO.getAddress()==null) {
            validate=false;
        }
        if(validate){
            customerDAO.save(customerInfoDTO);
        }
        return false;
    }
}
