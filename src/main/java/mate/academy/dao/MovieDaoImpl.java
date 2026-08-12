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
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.persist(movie);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Cant add movie: " + movie, e);
        } finally {
            session.close();
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Movie movie = session.find(Movie.class, id);
            return Optional.ofNullable(movie);
        } catch (Exception e) {
            throw new DataProcessingException("Cant find movie by id: " + id, e);
        }
    }
}
