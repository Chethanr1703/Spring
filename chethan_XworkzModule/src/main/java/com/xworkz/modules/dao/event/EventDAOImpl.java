package com.xworkz.modules.dao.event;

import com.xworkz.modules.entity.event.TeamEventEntity;
import com.xworkz.modules.entity.event.TeamEventResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;

@Controller
public class EventDAOImpl implements EventDAO{

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean saveEvent(TeamEventEntity event) {

        EntityManager em = entityManagerFactory.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(event);
            em.getTransaction().commit();
            return true;
        } finally {
            em.close();
        }
    }

//    @Override
//    public TeamEventEntity getEventById(int id) {
//
//        EntityManager em = entityManagerFactory.createEntityManager();
//
//        try {
//            return em.find(TeamEventEntity.class, id);
//        } finally {
//            em.close();
//        }
//    }


    @Override
    public boolean saveEventResponse(TeamEventResponseEntity response) {

        EntityManager em = entityManagerFactory.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(response);
            em.getTransaction().commit();
            return true;
        } finally {
            em.close();
        }
    }


    @Override
    public TeamEventResponseEntity findResponse(int eventId, String email) {

        EntityManager em = entityManagerFactory.createEntityManager();

        try {
            Query query = em.createQuery(
                    "FROM TeamEventResponseEntity r WHERE r.eventId = :eventId AND r.memberEmail = :email"
            );

            query.setParameter("eventId", eventId);
            query.setParameter("email", email);
//            List<TeamEventResponseEntity> queryResultList =query.getResultList();

            return(TeamEventResponseEntity) query.getSingleResult();

        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }


}
