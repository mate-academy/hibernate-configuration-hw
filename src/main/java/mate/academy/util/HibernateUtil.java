package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory instance = initSessionFctory();

    private HibernateUtil() {
    }

    public static SessionFactory getSessionFactory() {
        return instance;
    }

    private static SessionFactory initSessionFctory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            throw new RuntimeException("Can't create session factory ", e);
        }
    }

}
