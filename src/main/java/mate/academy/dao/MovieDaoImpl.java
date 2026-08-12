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
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
            return movie;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Couldn't insert movie: " + movie, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Optional get(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Optional<Movie> movie = Optional.ofNullable(session.get(Movie.class, id));
            if (movie == null) {
                throw new DataProcessingException("Couldn't get movie by id " + id
                        + ", movie not found");
            }
            return movie;
        } catch (Exception e) {
            throw new DataProcessingException("Couldn't get movie by id " + id, e);
        }
    }
}
