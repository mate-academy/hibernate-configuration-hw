package mate.academy.util;

import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class HibernateUtilTest {

    @Test
    void getSessionFactory() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        assertNotNull(sessionFactory, "SessionFactory should be initialized");
    }
}
