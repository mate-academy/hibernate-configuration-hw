package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    private HibernateUtil() {
    }

    private static SessionFactory initSessionFactory() {
        if (sessionFactory == null) {
            return new Configuration().configure().buildSessionFactory();
        }
        return sessionFactory;
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = initSessionFactory();
        }
        return sessionFactory;
    }
}
