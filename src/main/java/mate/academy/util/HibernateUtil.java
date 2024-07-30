package mate.academy.util;

import mate.academy.entity.Movie;
import org.hibernate.SessionFactory;
import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory SESSION_FACTORY = initSessionFactory();
    private static final String USERNAME_KEY = "hibernate.connection.username";
    private static final String PASSWORD_KEY = "hibernate.connection.password";

    private HibernateUtil() {
    }

    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }

    private static SessionFactory initSessionFactory() {
        try {
            return buildConfiguration()
                    .configure()
                    .setProperty(USERNAME_KEY, PropertiesUtil.get(USERNAME_KEY))
                    .setProperty(PASSWORD_KEY, PropertiesUtil.get(PASSWORD_KEY))
                    .buildSessionFactory();
        } catch (Exception e) {
            throw new RuntimeException("Can't create session factory ", e);
        }
    }

    private static Configuration buildConfiguration() {
        Configuration configuration = new Configuration();
        configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
        configuration.addAnnotatedClass(Movie.class);
        return configuration;
    }
}
