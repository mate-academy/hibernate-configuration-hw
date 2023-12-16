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
    @Override
    public Movie add(Movie movie) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(movie);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw new DataProcessingException("Cannot add to db movie: " + movie, e);
        } finally {
            session.close();
        }
        return null;
    }

    @Override
    public Optional<Movie> get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Movie movie = session.get(Movie.class, id);
            return Optional.of(movie);
        } catch (Exception e) {
            throw new DataProcessingException("Cannot get from db movie by id: " + id, e);
        }
    }
}
