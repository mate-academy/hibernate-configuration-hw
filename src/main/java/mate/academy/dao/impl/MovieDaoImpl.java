package mate.academy.dao.impl;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.exception.DataProcessingException;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie add(Movie movie) {
        return executeWithTransaction(session -> {
            session.save(movie);
            return movie;
        });
    }

    @Override
    public Optional<Movie> get(Long id) {
        return executeWithTransaction(session -> {
            Movie movie = session.get(Movie.class, id);
            return Optional.ofNullable(movie);
        });
    }

    private <T> T executeWithTransaction(SessionOperation<T> operation) {
        SessionFactory sessionFactory;
        Session session = null;
        Transaction transaction = null;
        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            T result = operation.execute(session);
            transaction.commit();
            return result;
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Error during database operation");
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @FunctionalInterface
    private interface SessionOperation<T> {
        T execute(Session session);
    }
}
