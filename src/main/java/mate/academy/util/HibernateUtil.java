package mate.academy.util;

import mate.academy.model.Movie;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateUtil {
    private static final SessionFactory sessionFactory = initSessionFactory();

    private HibernateUtil() {
    }

    private static SessionFactory initSessionFactory() {
        try {
            Configuration cfg = new Configuration().configure();
            cfg.addAnnotatedClass(Movie.class);
            return cfg.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(
                    "Initial SessionFactory creation failed: " + ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
