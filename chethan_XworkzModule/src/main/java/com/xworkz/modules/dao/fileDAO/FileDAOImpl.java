package com.xworkz.modules.dao.fileDAO;

import com.xworkz.modules.entity.AddTeamEntity;
import com.xworkz.modules.entity.SignupEntity;
import com.xworkz.modules.entity.file.FileEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;

@Controller
public class FileDAOImpl implements FileDAO{

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public int saveFile(FileEntity entity) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        int id = entity.getId();
        em.close();
        return id;
    }


    @Override
    public FileEntity findById(int id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        return em.find(FileEntity.class, id);
    }



    @Override
    public SignupEntity findEntityByEmail(String email) {

        EntityManager em = entityManagerFactory.createEntityManager();

        try {
            Query query = em.createQuery(
                    "FROM SignupEntity r WHERE r.email = :email"
            );
            query.setParameter("email", email);

            return (SignupEntity) query.getSingleResult();

        } catch (NoResultException e) {
            return null;

        } finally {
            em.close();
        }
    }


    @Override
    public List<AddTeamEntity> findEntity() {

        EntityManager em = entityManagerFactory.createEntityManager();

        try {
            Query query = em.createQuery(
                    "FROM AddTeamEntity r "
            );
            return (List<AddTeamEntity>) query.getResultList();

        } catch (NoResultException e) {
            return null;

        } finally {
            em.close();
        }
    }


}
