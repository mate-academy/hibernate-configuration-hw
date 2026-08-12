package mate.academy.dao;

import java.util.Optional;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Service
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
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Cant save movie to DB. Movie: " + movie, e);
        } finally {
            transaction.commit();
            session.close();
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
                Session session = sessionFactory.openSession();) {
            Movie movie = session.get(Movie.class, id);
            return Optional.ofNullable(movie);
        } catch (Exception e) {
            throw new DataProcessingException("Cant get movie by id " + id, e);
        }

    }
}
