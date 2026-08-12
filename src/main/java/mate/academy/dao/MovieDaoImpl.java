package mate.academy.dao;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.TransactionRequiredException;
import java.util.Optional;
import mate.academy.exceptions.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.HibernateException;
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
        } catch (HibernateException e) {
            throw new DataProcessingException("Cannot open the session.", e);
        } catch (EntityExistsException | TransactionRequiredException e) {
            throw new DataProcessingException("Cannot save the movie: " + movie, e);
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Commit fails.", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
                Session session = sessionFactory.openSession()) {
            return Optional.ofNullable(session.get(Movie.class, id));
        } catch (HibernateException e) {
            throw new DataProcessingException("Cannot get movie by id: " + id, e);
        }
    }
}
