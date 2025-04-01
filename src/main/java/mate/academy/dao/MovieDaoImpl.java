package mate.academy.dao;

import java.util.Optional;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {

    @Override
    public Movie add(Movie movie) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(movie);
            transaction.commit();

            if (movie.getId() == null) {
                throw new RuntimeException("Cannot add movie: " + movie);
            }
        } catch (RuntimeException e) {
            if (transaction == null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Data was not processed!", e);
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        Movie movie;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            movie = session.get(Movie.class, id);
        } catch (RuntimeException e) {
            throw new DataProcessingException("Can't get movie by id " + id, e);
        }
        return Optional.ofNullable(movie);
    }
}
