package com.xworkz.forms.repo.course;

import com.xworkz.forms.entity.CourseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class CourseRepositoryImpl implements CourseRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(CourseEntity entity) {
      EntityManager entityManager =  entityManagerFactory.createEntityManager();
      entityManager.getTransaction().begin();
      entityManager.persist(entity);
      entityManager.getTransaction().commit();
      return true;

    }
}
