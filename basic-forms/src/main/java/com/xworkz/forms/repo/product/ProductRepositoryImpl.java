package com.xworkz.forms.repo.product;

import com.xworkz.forms.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository

public class ProductRepositoryImpl implements ProductRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public void save(ProductEntity entity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
    }
}
