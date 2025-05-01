package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import mate.academy.model.Movie;  // <-- dodaj import

public final class HibernateUtil {
    private static final SessionFactory sessionFactory = initSessionFactory();

    private HibernateUtil() {
        // zapobiega tworzeniu instancji
    }

    private static SessionFactory initSessionFactory() {
        try {
            // Jeżeli chcesz mieć pewność, że encja zostanie wczytana,
            // możesz dodać ją ręcznie:
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
