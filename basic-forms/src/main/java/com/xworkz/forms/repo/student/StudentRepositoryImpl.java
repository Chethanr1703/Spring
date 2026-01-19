package com.xworkz.forms.repo.student;

import com.xworkz.forms.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public void save(StudentEntity entity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
