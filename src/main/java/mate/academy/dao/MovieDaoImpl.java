package mate.academy.dao;

import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie add(Movie movie) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
        } catch (Exception e) {
            throw new DataProcessingException("Can't save movie: " + movie + " to DB.", e);
        }
        session.close();
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            return Optional.ofNullable(session.get(Movie.class, id));
        } catch (Exception e) {
            throw new DataProcessingException("Can't get movie with id: " + id + " from DB", e);
        }
    }
}
