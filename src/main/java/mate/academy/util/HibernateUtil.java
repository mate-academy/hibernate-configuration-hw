package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactoryInstance = initSessionFactoryInstance();

    private HibernateUtil() {
    }

    private static SessionFactory initSessionFactoryInstance() {
        return sessionFactoryInstance =
                new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactoryInstance;
    }
}
