package mate.academy.dao;

import java.util.Optional;
import mate.academy.lib.Dao;
import mate.academy.lib.DataProcessingException;
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
            if (transaction != null) {
                transaction.rollback();
                throw new DataProcessingException("Can't save movie: " + movie);
            }
        } finally {
            session.close();
        }

        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        Optional<Movie> movie = null;
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            movie = Optional.ofNullable(session.get(Movie.class, id));
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
                throw new DataProcessingException("Can't find movie with id:" + id);
            }
        } finally {
            session.close();
        }

        return movie;
    }
}
