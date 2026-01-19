package com.xworkz.forms.service.job;

import com.xworkz.forms.dto.JobApplicationDTO;
import com.xworkz.forms.entity.JobApplicationEntity;
import com.xworkz.forms.repo.jobapplication.JobApplicationRepository;
import com.xworkz.forms.service.jobapplication.JobApplicationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobApplicationServiceImpl implements JobApplicationService {

    @Autowired
    private JobApplicationRepository repository;

    @Override
    public void save(JobApplicationDTO dto) {
        JobApplicationEntity entity = new JobApplicationEntity();
        BeanUtils.copyProperties(dto, entity);
        repository.save(entity);
    }
}
