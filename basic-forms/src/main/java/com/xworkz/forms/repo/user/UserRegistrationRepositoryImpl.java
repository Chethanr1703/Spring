package com.xworkz.forms.repo.user;

import com.xworkz.forms.entity.UserRegistrationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class UserRegistrationRepositoryImpl implements UserRegistrationRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public void save(UserRegistrationEntity entity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
