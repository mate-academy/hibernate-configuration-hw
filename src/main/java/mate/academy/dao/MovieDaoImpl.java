package mate.academy.dao;

import java.util.Optional;
import mate.academy.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    private final SessionFactory sessionFactory;

    public MovieDaoImpl() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public Movie add(Movie movie) {
        if (movie == null) {
            throw new IllegalArgumentException("movie must not be null");
        }
        if (movie.getTitle() == null) {
            throw new IllegalArgumentException("title must not be null");
        }
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
            return movie;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Could not add movie", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Optional<Movie> get(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("id must not be null");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("id must be greater than 0");
        }
        Session session = null;
        try {
            session = sessionFactory.openSession();
            return Optional.ofNullable(session.get(Movie.class, id));
        } catch (Exception e) {
            throw new DataProcessingException("Could not get movie", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
