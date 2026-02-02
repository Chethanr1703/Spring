package com.xworkz.modules.dao;

import com.xworkz.modules.entity.SignupEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;

@Repository
public class ProfileDAOImpl implements ProfileDAO{
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean updateProfile(String email, String phone, int age, String address) {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            em.getTransaction().begin();

            Query query = em.createQuery("UPDATE SignupEntity r SET r.phone=:phone, r.age=:age, r.address=:address WHERE r.email=:email");
            query.setParameter("email", email);
            query.setParameter("phone", phone);
            query.setParameter("age", age);
            query.setParameter("address", address);

            int rows = query.executeUpdate();

            em.getTransaction().commit();
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            em.close();
        }
    }


    @Override
    public SignupEntity findByEmail(String email) {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            Query query = em.createQuery("SELECT s FROM SignupEntity s WHERE s.email = :email");
            query.setParameter("email", email);
           SignupEntity signupEntity =  (SignupEntity) query.getSingleResult();
            return signupEntity;
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }

    @Override
    public boolean updatePasswordByEmail(String email, String newPassword) {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            em.getTransaction().begin();

            Query query = em.createQuery("UPDATE SignupEntity r SET r.password=:pwd WHERE r.email=:email");
            query.setParameter("email", email);
            query.setParameter("pwd", newPassword);

            query.executeUpdate();
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            em.close();
        }
    }

}
