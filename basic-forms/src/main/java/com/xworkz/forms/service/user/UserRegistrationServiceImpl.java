package com.xworkz.forms.service.user;

import com.xworkz.forms.dto.UserRegistrationDTO;
import com.xworkz.forms.entity.UserRegistrationEntity;
import com.xworkz.forms.repo.user.UserRegistrationRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

    @Autowired
    private UserRegistrationRepository repository;

    @Override
    public void save(UserRegistrationDTO dto) {
        UserRegistrationEntity entity = new UserRegistrationEntity();
        BeanUtils.copyProperties(dto, entity);
        repository.save(entity);
    }
}
