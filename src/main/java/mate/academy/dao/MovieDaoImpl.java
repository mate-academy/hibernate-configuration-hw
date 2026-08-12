package mate.academy.dao;

import java.util.Optional;
import mate.academy.exception.DataProcessingException;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MovieDaoImpl implements MovieDao {
    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Movie add(Movie movie) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.persist(movie);
            transaction.commit();
            return movie;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Could not insert movie: " + movie, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Optional<Movie> get(Long id) {
        Session session = sessionFactory.openSession();
        try {
            Movie movie = session.get(Movie.class, id);
            return Optional.ofNullable(movie);
        } catch (Exception e) {
            throw new DataProcessingException("Could not get movie by id: " + id, e);
        } finally {
            session.close();
        }
    }
}
