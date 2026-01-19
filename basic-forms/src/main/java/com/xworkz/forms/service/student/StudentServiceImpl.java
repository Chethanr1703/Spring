package com.xworkz.forms.service.student;

import com.xworkz.forms.dto.StudentDTO;
import com.xworkz.forms.entity.StudentEntity;
import com.xworkz.forms.repo.student.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public boolean save(StudentDTO dto) {
        StudentEntity entity = new StudentEntity();
        BeanUtils.copyProperties(dto, entity);

        studentRepository.save(entity);
        return true;
    }
}
