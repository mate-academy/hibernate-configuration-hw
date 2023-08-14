package mate.academy.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory instance = initSessionFactory();

    public HibernateUtil() {
    }

    private static SessionFactory initSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            throw new RuntimeException("Error building the SessionFactory: " + e.getMessage(), e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return instance;
    }
}
