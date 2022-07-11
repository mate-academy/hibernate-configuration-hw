package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory factory;

    private HibernateUtil() {
    }

    public static SessionFactory getFactory() {
        if (factory == null) {
            factory = new Configuration().configure("hibernate.cfg.xml")
                            .buildSessionFactory();
        }
        return factory;
    }
}
