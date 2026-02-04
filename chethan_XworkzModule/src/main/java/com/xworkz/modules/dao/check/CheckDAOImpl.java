package com.xworkz.modules.dao.check;

import com.xworkz.modules.entity.SignupEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;

@Repository
public class CheckDAOImpl implements CheckDAO {


    @Autowired
    EntityManagerFactory entityManagerFactory;


    @Override
    public SignupEntity checkPhoneNumber(String phone) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            Query query = entityManager.createQuery(" from SignupEntity user where user.phone = :phone");
            query.setParameter("phone", phone);
            SignupEntity signupEntity = (SignupEntity) query.getSingleResult();
            if (signupEntity != null) {
                return signupEntity;
            }
        } catch (NoResultException e) {
          return null;
            }
        return null;
    }
}
