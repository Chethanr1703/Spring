package com.xworkz.forms.repo.event;

import com.xworkz.forms.entity.EventEntity;

public interface EventRepository {

    boolean save(EventEntity entity);
}
