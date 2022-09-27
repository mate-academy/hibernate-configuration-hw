package mate.academy.dao;

import java.util.Optional;
import mate.academy.exceptions.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    private SessionFactory sessionFactory;

    public MovieDaoImpl() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public Movie add(Movie movie) {
        sessionFactory = HibernateUtil.getSessionFactory();
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
        } catch (Exception exception) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException(
                    "Can't save movie to DB " + movie, exception);
        } finally {
            if (transaction != null) {
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
            throw new DataProcessingException(
                    "Can't get movie with id=" + id + " from DB", e);
        }
    }
}
