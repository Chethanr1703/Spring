package com.xworkz.forms.service.bankaccount;

import com.xworkz.forms.dto.BankAccountDTO;
import com.xworkz.forms.entity.BankAccountEntity;
import com.xworkz.forms.repo.bankaccount.BankAccountRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService {

    @Autowired
    private BankAccountRepository repository;

    @Override
    public boolean save(BankAccountDTO dto) {
        BankAccountEntity entity = new BankAccountEntity();
        BeanUtils.copyProperties(dto,entity);

        return repository.save(entity);
    }
}
