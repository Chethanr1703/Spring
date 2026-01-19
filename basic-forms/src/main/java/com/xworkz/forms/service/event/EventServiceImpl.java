package com.xworkz.forms.service.event;

import com.xworkz.forms.dto.EventRegistrationDTO;
import com.xworkz.forms.entity.EventEntity;
import com.xworkz.forms.repo.event.EventRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository repository;

    @Override
    public boolean save(EventRegistrationDTO dto) {
        EventEntity entity = new EventEntity();
        BeanUtils.copyProperties(dto,entity);
        return repository.save(entity);
    }
}
