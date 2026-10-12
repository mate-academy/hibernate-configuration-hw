package mate.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {
    private static final SessionFactory instance = initSF();

    private static SessionFactory initSF() {
        return new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getInstance() {
        return instance;
    }
}
