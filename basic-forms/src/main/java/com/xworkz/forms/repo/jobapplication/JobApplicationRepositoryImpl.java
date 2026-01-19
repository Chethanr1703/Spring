package com.xworkz.forms.repo.jobapplication;

import com.xworkz.forms.entity.JobApplicationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class JobApplicationRepositoryImpl implements JobApplicationRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;
    @Override
    public void save(JobApplicationEntity entity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();

    }
}
