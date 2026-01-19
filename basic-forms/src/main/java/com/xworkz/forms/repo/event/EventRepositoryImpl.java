package com.xworkz.forms.repo.event;

import com.xworkz.forms.entity.EventEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class EventRepositoryImpl implements EventRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;


    @Override
    public boolean save(EventEntity entity) {
     EntityManager entityManager =   entityManagerFactory.createEntityManager();
     entityManager.getTransaction().begin();
     entityManager.persist(entity);
     entityManager.getTransaction().commit();
        return false;
    }
}
