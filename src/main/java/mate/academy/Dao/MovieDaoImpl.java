package mate.academy.Dao;

import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Optional;

@Dao
public class MovieDaoImpl implements MovieDao {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Movie add(Movie movie) {
        Session session = null;
        Transaction transaction = null;
        try {
           session = sessionFactory.openSession();
           transaction = session.beginTransaction();
           session.save(movie);
           transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Unable to save a movie to DB", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        Movie movie;
        try (Session session = sessionFactory.openSession()) {
            movie = session.get(Movie.class, id);
        } catch (Exception e) {
            throw new DataProcessingException("Unable to  get a movie by id: " + id + " from DB", e);
        }
        return Optional.ofNullable(movie);
    }
}
