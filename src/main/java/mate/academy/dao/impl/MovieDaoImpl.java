package mate.academy.dao.impl;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Movie add(Movie movie) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.persist(movie);
            transaction.commit();
            return movie;
        } catch (RuntimeException ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException(String.format(
                    "An error occurred while trying to add a film %s to the database", movie), ex);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Optional<Movie> get(Long id) {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            Movie movie = session.get(Movie.class, id);
            return Optional.ofNullable(movie);
        } catch (RuntimeException ex) {
            throw new DataProcessingException(String.format(
                    "An error occurred while trying to retrieve a film with ID %d "
                            + "from the database", id), ex);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
