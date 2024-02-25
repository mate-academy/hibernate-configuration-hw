package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory instance = initSessionsFactory();

    private HibernateUtil() {
    }

    private static SessionFactory initSessionsFactory() {
        return new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return instance;
    }
}
