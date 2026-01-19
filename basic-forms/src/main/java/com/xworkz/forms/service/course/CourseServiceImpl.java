package com.xworkz.forms.service.course;

import com.xworkz.forms.dto.CourseDTO;
import com.xworkz.forms.entity.CourseEntity;
import com.xworkz.forms.repo.course.CourseRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository repository;

    @Override
    public boolean save(CourseDTO dto) {
        CourseEntity entity = new CourseEntity();
        BeanUtils.copyProperties(dto,entity);
        return repository.save(entity);
    }
}
