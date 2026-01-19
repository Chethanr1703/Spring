package com.xworkz.forms.service.employee;

import com.xworkz.forms.dto.EmployeeDTO;
import com.xworkz.forms.entity.EmployeeEntity;
import com.xworkz.forms.repo.employee.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public boolean save(EmployeeDTO dto) {
        EmployeeEntity entity = new EmployeeEntity();
        BeanUtils.copyProperties(dto, entity);
        return repository.save(entity);
    }
}
