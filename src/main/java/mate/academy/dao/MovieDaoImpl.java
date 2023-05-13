package mate.academy.dao;

import java.util.Optional;
import mate.academy.exception.DataProcessingException;
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
        Session session = null;
        Transaction transaction = null;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.persist(movie);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't add movie to DB " + movie, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        Movie movie;
        Session session = null;

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            movie = session.get(Movie.class, id);
        } catch (Exception e) {
            throw new DataProcessingException("Can't get movie from DB " + id, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return Optional.ofNullable(movie);
    }
}
