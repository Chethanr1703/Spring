package com.xworkz.forms.service.feedback;

import com.xworkz.forms.dto.FeedbackDTO;
import com.xworkz.forms.entity.FeedbackEntity;
import com.xworkz.forms.repo.feedback.FeedbackRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackRepository repository;

    @Override
    public boolean save(FeedbackDTO dto) {

        FeedbackEntity entity = new FeedbackEntity();
        BeanUtils.copyProperties(dto, entity);
        repository.save(entity);
        return true;
    }
}
