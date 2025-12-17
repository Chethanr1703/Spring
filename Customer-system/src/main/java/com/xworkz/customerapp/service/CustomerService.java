package com.xworkz.customerapp.service;

import com.xworkz.customerapp.dto.CustomerInfoDTO;

public interface CustomerService {
    boolean validateAndSave(CustomerInfoDTO customerInfoDTO);
}
