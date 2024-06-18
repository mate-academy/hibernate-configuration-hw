package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import mate.academy.model.Movie;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = initSessionFactory();

    private HibernateUtil() {
    }

    private static SessionFactory initSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Movie.class);
            return configuration.configure().buildSessionFactory();
        } catch (Exception e) {
            throw new RuntimeException("Cannot create session factory", e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
