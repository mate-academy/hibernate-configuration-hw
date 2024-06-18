package mate.academy.dao;

import java.util.Optional;
import mate.academy.exception.DataProcessingException;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MovieDaoImpl implements MovieDao {

    @Override
    public Movie add(Movie movie) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactoryInstance();
        if (sessionFactory == null) {
            throw new DataProcessingException("SessionFactory is null");
        }
        Session session = sessionFactory.openSession();
        if (session == null) {
            throw new DataProcessingException("Session is null");
        }
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(movie);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw new DataProcessingException("Error adding movie", e);
        } finally {
            session.close();
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactoryInstance();
        Session session = sessionFactory.openSession();
        try {
            return Optional.ofNullable((Movie) session.get(Movie.class, id));
        } catch (Exception e) {
            throw new DataProcessingException("Error getting movie", e);
        } finally {
            session.close();
        }
    }
}
