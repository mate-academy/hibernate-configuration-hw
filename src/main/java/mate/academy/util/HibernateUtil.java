package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory instance = intSessionFactory();

    private HibernateUtil() {
    }

    private static SessionFactory intSessionFactory() {
        return new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getsessionFactory() {
        return instance;
    }

    ;
}
