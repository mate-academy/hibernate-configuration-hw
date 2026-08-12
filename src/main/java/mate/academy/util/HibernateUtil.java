package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory instance = initialize();

    private HibernateUtil() {
    }

    private static SessionFactory initialize() {
        return new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getInstance() {
        return instance;
    }
}
