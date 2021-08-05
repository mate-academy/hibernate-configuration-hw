package mate.academy.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    private HibernateUtil() {
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("mate-academy");
            EntityManager entityManager = emf.createEntityManager();
            Session session = entityManager.unwrap(org.hibernate.Session.class);
            sessionFactory = session.getSessionFactory();
        }
        return sessionFactory;
    }
}
