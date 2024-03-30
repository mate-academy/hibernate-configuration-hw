package mate.academy.util;

import mate.academy.lib.Service;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Service
public class HibernateUtil {
    private static SessionFactory instance = initSessionFactory();

    private HibernateUtil() {
    }

    private static SessionFactory initSessionFactory() {
        return new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return instance;
    }
}
