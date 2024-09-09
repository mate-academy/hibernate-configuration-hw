package mate.academy.dao;

import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import java.util.Optional;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie add(Movie movie) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            commitTransaction(transaction);
        } catch (RuntimeException e) {
            rollbackTransaction(transaction);
            throw new DataProcessingException("Can not create a record in the movie table: " + movie, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Movie movie = session.get(Movie.class, id);
            return Optional.ofNullable(movie);
        } catch (RuntimeException e) {
            throw new DataProcessingException("Can not find a record in the movie table by ID: " + id, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }

    }

    private void commitTransaction(Transaction transaction) {
        if (transaction != null && transaction.getStatus() == TransactionStatus.ACTIVE) {
            transaction.commit();
        }
    }

    private void rollbackTransaction(Transaction transaction) {
        if (transaction != null && transaction.getStatus() == TransactionStatus.ACTIVE) {
            transaction.rollback();
        }
    }
}
