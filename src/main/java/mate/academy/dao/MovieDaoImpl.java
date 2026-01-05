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
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't add movie:" + movie, ex);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Optional<Movie> get(Long id) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Movie movie = (Movie) session.get(Movie.class, id);
            transaction.commit();
            return Optional.ofNullable(movie);
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't get movie from id:" + id, ex);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
