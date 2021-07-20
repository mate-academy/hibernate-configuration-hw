package mate.academy.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

    private HibernateUtil() {
    }

    public static SessionFactory getSessionFactory() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mate-academy");
        EntityManager entityManager = emf.createEntityManager();
        // Get the Hibernate Session from the EntityManager in JPA
        Session session = entityManager.unwrap(org.hibernate.Session.class);
        return session.getSessionFactory();
    }
}
