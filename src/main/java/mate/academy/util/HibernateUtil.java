package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory instance = initializeSessionInstance();

    private HibernateUtil() {
    }

    public static SessionFactory getSessionFactoryInstance() {
        return instance;
    }

    private static SessionFactory initializeSessionInstance() {
        return new Configuration().configure().buildSessionFactory();
    }
}
