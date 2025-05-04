package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory instance = initSessionfactory();

    private HibernateUtil() {

    }

    private static SessionFactory initSessionfactory() {
        return new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getSessionfactory() {
        return instance;
    }
}
