package com.xworkz.forms.repo.feedback;

import com.xworkz.forms.entity.FeedbackEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class FeedbackRepositoryImpl implements FeedbackRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public void save(FeedbackEntity entity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }
}
