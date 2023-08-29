package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory FACTORY = getFactory();

    public static SessionFactory initSessionFactory() {
        return FACTORY;
    }

    private static SessionFactory getFactory() {
        return new Configuration().configure().buildSessionFactory();
    }
}
