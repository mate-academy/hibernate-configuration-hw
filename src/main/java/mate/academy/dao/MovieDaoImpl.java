package mate.academy.dao;

import java.util.Optional;
import mate.academy.exeptions.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Movie add(Movie movie) {
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
            throw new DataProcessingException("Can`t save movie - " + movie + " to BD", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            return Optional.of(session.get(Movie.class, id));
        } catch (HibernateException e) {
            throw new DataProcessingException("Could not get instance of movies", e);
        } catch (Exception e) {
            return Optional.empty();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
