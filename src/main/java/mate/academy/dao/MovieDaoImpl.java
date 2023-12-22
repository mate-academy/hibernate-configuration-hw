package mate.academy.dao;

import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.Transaction;
import mate.academy.exception.DataProcessingException;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import mate.academy.lib.Dao;

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

        } catch (RuntimeException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("");
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return Optional.ofNullable(session.get(Movie.class, id));
        } catch (RuntimeException e) {
            throw new DataProcessingException("Can't get movie by id from DB: " + id, e);
        }
    }
}
