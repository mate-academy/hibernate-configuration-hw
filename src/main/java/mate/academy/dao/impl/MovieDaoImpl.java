package mate.academy.dao.impl;

import static mate.academy.util.HibernateUtil.getSessionFactory;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.exception.DataProcessingException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie add(Movie movie) {
        SessionFactory sessionFactory;
        Session session = null;
        Transaction transaction = null;
        try {
            sessionFactory = getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
            return movie;
        } catch (RuntimeException exception) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't add new Movie do DB. Please try again.");
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Optional<Movie> get(Long id) {
        SessionFactory sessionFactory;
        Session session = null;
        try {
            sessionFactory = getSessionFactory();
            session = sessionFactory.openSession();
            return Optional.ofNullable(session.get(Movie.class, id));
        } catch (RuntimeException exception) {
            throw new DataProcessingException("Can't get Object from DB. Wrong credential.");
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
