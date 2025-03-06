package mate.academy.util;

import org.hibernate.SessionFactory;
import mate.academy.exception.DataProcessingException;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory = initSessionFactory();

    private static SessionFactory initSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch(Exception e) {
            throw new DataProcessingException("Can not create Session factory instance", e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
