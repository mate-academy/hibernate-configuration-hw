package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = initSessionFactory();

    private HibernateUtil() {
    }

    private static SessionFactory initSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            System.err.println("Critical error: cannot create SessionFactory! " + e);
            throw new RuntimeException("Hibernate initialization error. ", e);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
