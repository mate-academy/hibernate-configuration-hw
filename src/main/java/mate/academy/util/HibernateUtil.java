package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//for security reasons, the password is stored in an
// environment variable and not in the hibernate.cfg.xml file
/*public class HibernateUtil {

    private HibernateUtil() {
    }

    private static final SessionFactory instance = initSessionFactory();

    public static SessionFactory getSessionFactory() {
        return instance;
    }

    private static SessionFactory initSessionFactory() {
        String password = System.getenv("DB_PASSWORD");

        return new Configuration().configure()
                .setProperty("hibernate.connection.password", password).buildSessionFactory();
    }
}*/
public class HibernateUtil {

    private static final SessionFactory instance = initSessionFactory();

    private HibernateUtil() {
    }

    public static SessionFactory getSessionFactory() {
        return instance;
    }

    private static SessionFactory initSessionFactory() {
        return new Configuration()
                .configure()
                .buildSessionFactory();
    }
}


