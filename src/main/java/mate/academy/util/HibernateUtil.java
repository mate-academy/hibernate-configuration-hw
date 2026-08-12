package mate.academy.util;

import mate.academy.exception.DataProcessingException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class HibernateUtil {
    private static final Logger log = LoggerFactory.getLogger(HibernateUtil.class);
    private static SessionFactory sessionFactory;

    static {
        initSessionFactory("hibernate.cfg.xml");
    }

    private HibernateUtil() {
    }

    public static void initSessionFactory(String configFileName) {
        try {
            log.info("Initializing Hibernate SessionFactory using {}", configFileName);
            sessionFactory = new Configuration().configure(configFileName).buildSessionFactory();
        } catch (Throwable ex) {
            log.error("SessionFactory initialization failed", ex);
            throw new DataProcessingException("SessionFactory initialization failed", ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
