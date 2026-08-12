package mate.academy.dao;

import java.util.Optional;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie add(Movie movie) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.persist(movie);
            transaction.commit();
            if (movie.getId() == null) {
                throw new RuntimeException("Can't add new movie: " + movie);
            }
        } catch (RuntimeException exception) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Exception!", exception);
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
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            movie = session.get(Movie.class, id);
        } catch (RuntimeException exception) {
            throw new DataProcessingException("Can't get movie by id " + id, exception);
        }
        return Optional.ofNullable(movie);
    }
}
