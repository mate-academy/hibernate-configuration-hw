package mate.academy.dao;

import java.util.Optional;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.service.DataProcessingException;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

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
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't add movie to the DB: " + movie);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = null;
        try {
            session = sessionFactory.openSession();
        } catch (Exception e) {
            throw new DataProcessingException("Can't get movie with ID: " + id);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return Optional.ofNullable(session.get(Movie.class, id));
    }
}
