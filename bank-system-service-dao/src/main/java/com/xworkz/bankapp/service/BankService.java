package com.xworkz.bankapp.service;

import com.xworkz.bankapp.dto.BankDTO;

public interface BankService {
    boolean validateBankInfo(BankDTO bankDTO);
}
