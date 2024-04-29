package mate.academy.dao;

import org.hibernate.HibernateException;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message) {
        super(message);
    }

    public DataProcessingException(String message, HibernateException e) {
        super(message);
    }
}
