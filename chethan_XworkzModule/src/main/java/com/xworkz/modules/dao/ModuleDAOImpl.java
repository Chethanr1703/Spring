package com.xworkz.modules.dao;

import com.xworkz.modules.entity.AddTeamEntity;
import com.xworkz.modules.entity.AddTeamMemberEntity;
import com.xworkz.modules.entity.SignupEntity;
import com.xworkz.modules.entity.file.FileEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Repository
public class ModuleDAOImpl implements ModuleDAO {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(SignupEntity signupEntity) {


        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(signupEntity);
        entityManager.getTransaction().commit();

        return true;
    }

    @Override
    public SignupEntity loginByEmail(String email) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            Query query = entityManager.createQuery("Select ref from SignupEntity ref where ref.email = :email");
            query.setParameter("email", email);
            SignupEntity signupEntity = (SignupEntity) query.getSingleResult();
            return signupEntity;
        } catch (NoResultException e) {
            return null;
        } finally {
            entityManager.close();
        }
    }

    @Override
    public void setCountToZero(String email) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("update SignupEntity user set user.count=0 where user.email=:eMail");
        query.setParameter("eMail", email);
        int rowsAffected = query.executeUpdate();
        System.out.println(rowsAffected);
        entityManager.getTransaction().commit();

    }

    @Override
    public int getCount(String email) {
        int count = 0;

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select user.count from SignupEntity user where user.email=:eMail");
        count = (int) query.setParameter("eMail", email).getSingleResult();
        entityManager.getTransaction().commit();

        return count;
    }

    @Override
    public void updateCount(String email) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("update SignupEntity user set user.count = user.count+1   where user.email=:eMail");
        query.setParameter("eMail", email);
        int rowsAffected = query.executeUpdate();
        System.out.println(rowsAffected);
        entityManager.getTransaction().commit();
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
    public boolean saveOtp(String email, String otp) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("update SignupEntity u set u.otp = :otp , u.otpTime = :time where u.email = :email");
        query.setParameter("otp", otp);
        query.setParameter("time", LocalDateTime.now());
        query.setParameter("email", email);
        int rowEffected = query.executeUpdate();
        entityManager.getTransaction().commit();
        if (rowEffected > 0) {
            return true;
        }
        return false;
    }




    @Override
    public boolean checkOtpMatch(String email, String otp) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            Query query = entityManager.createQuery("select ref from SignupEntity ref where ref.email = :email and ref.otp = :otp");
            query.setParameter("email", email);
            query.setParameter("otp", otp);

            SignupEntity entity = (SignupEntity) query.getSingleResult();

            LocalDateTime otpTime = entity.getOtpTime();
            LocalDateTime currentTime = LocalDateTime.now();

            long diff = ChronoUnit.SECONDS.between(otpTime, currentTime);

            return diff <= 60;
        } catch (NoResultException e) {
            return false;
        } finally {
            entityManager.close();
        }
    }

    @Override
    public boolean updateNewPassword(String email, String encryptedPassword) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query query = entityManager.createQuery("update SignupEntity ref set ref.password =:password where ref.email = :email ");
            query.setParameter("password", encryptedPassword);
            query.setParameter("email", email);
            int rowEffected = query.executeUpdate();
            entityManager.getTransaction().commit();
            if (rowEffected > 0) {
                return true;
            }
        } finally {
            entityManager.close();
        }
        return false;

    }
//--------------------------------------------------------------------------------
    @Override
    public boolean saveTeam(AddTeamEntity addTeamEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(addTeamEntity);
        entityManager.getTransaction().commit();

        return true;

    }

    @Override
    public AddTeamEntity findByTeamHeadEmail(String teamHeadEmail) {
        try{
            EntityManager em = entityManagerFactory.createEntityManager();
            Query q = em.createQuery("from AddTeamEntity tm where tm.email = :email");
            q.setParameter("email", teamHeadEmail);
            AddTeamEntity addTeamEntity = (AddTeamEntity) q.getSingleResult();
            em.close();
            return addTeamEntity;
        }catch (NoResultException e){
        return null;
    }
    }

    @Override
    public boolean saveTeamMember(AddTeamMemberEntity entity) {

            EntityManager em = entityManagerFactory.createEntityManager();
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            em.close();
            return true;
        }

    @Override
    public List<AddTeamEntity> getTeamByTeamHeadEmail() {
        EntityManager em = entityManagerFactory.createEntityManager();
        Query query = em.createQuery("Select tm from AddTeamEntity tm ");
       List<AddTeamEntity> teamEntities = query.getResultList();
       if(teamEntities!= null){
           return teamEntities;
       }

        return null;
    }

    @Override
    public int countTeamMembers(String teamName, String teamHeadEmail) {

        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            Long count = (Long) em.createQuery(
                            "SELECT COUNT(m) FROM AddTeamMemberEntity m WHERE m.teamName = :teamName AND m.teamHeadEmail = :email"
                    )
                    .setParameter("teamName", teamName)
                    .setParameter("email", teamHeadEmail)
                    .getSingleResult();

            return count.intValue();

        } finally {
            em.close();
        }
    }

    @Override
    public List<AddTeamMemberEntity> getTeamMemberByTeamName(String teamName) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("from AddTeamMemberEntity tm where tm.teamName = :teamName");
        query.setParameter("teamName",teamName);
        List<AddTeamMemberEntity> teamMemberEntities =query.getResultList();
        if(teamMemberEntities!= null){
            return teamMemberEntities;
        }else {
            return null;
        }

    }
//saving image to database
@Override
public boolean saveProfileImage(FileEntity image) {
    EntityManager em = entityManagerFactory.createEntityManager();
    em.getTransaction().begin();
    em.persist(image);
    em.getTransaction().commit();
    em.close();
    return true;
}


}



