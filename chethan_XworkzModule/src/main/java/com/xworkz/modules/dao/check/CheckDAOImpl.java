package com.xworkz.modules.dao.check;

import com.xworkz.modules.dto.AddTeamDTO;
import com.xworkz.modules.entity.AddTeamEntity;
import com.xworkz.modules.entity.AddTeamMemberEntity;
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

    @Override
    public boolean checkEmail(String email) {
        boolean isUserExists = false;
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Long count = (Long) entityManager
                .createQuery(
                        "select count(user) from SignupEntity user where user.email = :email"
                ).setParameter("email", email).getSingleResult();
        if (count > 0) {
            isUserExists = true;

        }
        return isUserExists;
    }



    @Override
    public AddTeamEntity checkTeamheadPhoneNumber(String phone) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            Query query = entityManager.createQuery(" from AddTeamEntity user where user.phone = :phone");
            query.setParameter("phone", phone);
            AddTeamEntity addTeamEntity = (AddTeamEntity) query.getSingleResult();
            if (addTeamEntity != null) {
                return addTeamEntity;
            }
        } catch (NoResultException e) {
            return null;
        }
        return null;
    }

    @Override
    public boolean checkTeamHeadEmail(String email) {
        boolean isUserExists = false;
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Long count = (Long) entityManager
                .createQuery(
                        "select count(user) from AddTeamEntity user where user.email = :email"
                ).setParameter("email", email).getSingleResult();
        if (count > 0) {
            isUserExists = true;

        }
        return isUserExists;
    }

    @Override
    public AddTeamMemberEntity checkTeamMemberPhoneNumber(String phone) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            Query query = entityManager.createQuery(" from AddTeamMemberEntity user where user.phone = :phone");
            query.setParameter("phone", phone);
            AddTeamMemberEntity addTeamEntity = (AddTeamMemberEntity) query.getSingleResult();
            if (addTeamEntity != null) {
                return addTeamEntity;
            }
        } catch (NoResultException e) {
            return null;
        }
        return null;
    }

    @Override
    public boolean checkTeamMemberEmail(String email) {
        boolean isUserExists = false;
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Long count = (Long) entityManager
                .createQuery(
                        "select count(user) from AddTeamMemberEntity user where user.email = :email"
                ).setParameter("email", email).getSingleResult();
        if (count > 0) {
            isUserExists = true;

        }
        return isUserExists;
    }
}
