package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory INSTANCE = initSessionFactory();

    public static SessionFactory getSessionFactory() {
        return INSTANCE;
    }

    private HibernateUtil() {
    }

    private static SessionFactory initSessionFactory() {
        return new Configuration().configure().buildSessionFactory();
    }
}
