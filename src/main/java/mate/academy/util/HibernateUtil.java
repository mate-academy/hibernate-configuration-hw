package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory instance = initSessionFactory();

    private HibernateUtil() {
    }

    private static SessionFactory initSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            throw new RuntimeException("Cannot create SessionFactory ", e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return instance;
    }
}
