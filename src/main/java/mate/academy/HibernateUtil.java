package mate.academy;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory emf = init();

    private HibernateUtil() {
    }

    private static SessionFactory init() {
        try {
            return new Configuration()
                    .configure()
                    .buildSessionFactory();
        } catch (Exception e) {
            throw new RuntimeException("Can't configure session factory.", e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return emf;
    }
}
