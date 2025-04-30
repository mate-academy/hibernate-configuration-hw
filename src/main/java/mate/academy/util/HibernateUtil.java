package mate.academy.util;

import mate.academy.lib.Inject;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Inject
public class HibernateUtil {
    private static final SessionFactory instance = initSessionFactory();

    private HibernateUtil() {
    }

    private static SessionFactory initSessionFactory() {
        return new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return instance;
    }
}
