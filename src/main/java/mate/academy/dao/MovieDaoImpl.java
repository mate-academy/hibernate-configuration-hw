package mate.academy.dao;

import java.util.Optional;
import mate.academy.DataProcessingException;
import mate.academy.model.Movie;
import mate.academy.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MovieDaoImpl implements MovieDao {

    @Override
    public Movie add(Movie movie) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
            return movie;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Failed to save the movie. " + ex.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Optional<Movie> get(Long id) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory()) {
            Session session = sessionFactory.openSession();
            Optional<Movie> result = Optional.ofNullable(session.get(Movie.class, id));
            session.close();
            return result;
        } catch (Exception ex) {
            throw new DataProcessingException("Failed to create a session" + ex.getMessage());
        }
    }
}
