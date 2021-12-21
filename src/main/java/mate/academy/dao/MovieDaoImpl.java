package mate.academy.dao;

import static mate.academy.util.HibernateUtil.getSessionFactory;

import java.util.Optional;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {

    @Override
    public Movie save(Movie movie) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't save movie to DB: " + movie, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        try (SessionFactory sessionFactory = getSessionFactory();
                Session session = sessionFactory.openSession()) {
            Movie movie = session.get(Movie.class, id);
            return Optional.ofNullable(movie);
        } catch (Exception e) {
            throw new DataProcessingException("Can't get Movie with id: " + id, e);
        }
    }
}
