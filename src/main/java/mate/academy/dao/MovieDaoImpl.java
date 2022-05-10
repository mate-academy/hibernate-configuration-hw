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
        Transaction addTransaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            addTransaction = session.beginTransaction();
            session.save(movie);
            addTransaction.commit();
        } catch (Exception e) {
            if (addTransaction != null) {
                addTransaction.rollback();
            }
            throw new DataProcessingException("Couldn't save movie " + movie, e);
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
            Movie movie = session.get(Movie.class, id);
            return Optional.ofNullable(movie);
        } catch (Exception e) {
            throw new DataProcessingException("Couldn't get movie by id " + id, e);
        }
    }
}
