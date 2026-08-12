package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory instance = initSessionFactory();

    private HibernateUtil() {
    }

    private static SessionFactory initSessionFactory() {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(mate.academy.model.Movie.class);
        return configuration.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return instance;
    }
}
