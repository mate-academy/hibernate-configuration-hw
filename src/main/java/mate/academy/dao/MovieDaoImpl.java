package mate.academy.dao;

import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Optional;

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
            session.save(movie);
            transaction.commit();
        } catch (DataProcessingException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't add movie: " +  movie, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return  movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession()) {
            return Optional.ofNullable(session.get(Movie.class, id));
        } catch (DataProcessingException e) {
         throw new RuntimeException("Can't get movie with Id: " + id, e);
        }
    }
}
