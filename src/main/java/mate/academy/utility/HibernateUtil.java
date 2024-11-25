package mate.academy.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    public static final String CAN_T_CREATE_SESSION_FACTORY_MSG = "Can't create session factory ";
    private static final SessionFactory sessionFactory = initSessionFactory();

    private HibernateUtil() {
    }

    private static SessionFactory initSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            throw new RuntimeException(CAN_T_CREATE_SESSION_FACTORY_MSG, e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
