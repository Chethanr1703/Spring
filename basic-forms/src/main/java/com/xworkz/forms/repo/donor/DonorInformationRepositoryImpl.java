package com.xworkz.forms.repo.donor;

import com.xworkz.forms.entity.DonorInformationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class DonorInformationRepositoryImpl implements DonorInformationRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public void save(DonorInformationEntity entity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();

    }
}
