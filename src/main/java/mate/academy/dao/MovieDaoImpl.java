package mate.academy.dao;

import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.models.Movie;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.Optional;
import static mate.academy.util.HibernateUtil.getSessionFactory;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie add(Movie movie) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw  new DataProcessingException("Can't add movie " + movie + " to DB.", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        try (Session session = getSessionFactory().openSession()){
            return Optional.ofNullable(session.get(Movie.class, id));
        } catch (HibernateException e) {
            throw new DataProcessingException("Can't get movie wiht id = " + id + " from DB", e);
        }
    }
}
