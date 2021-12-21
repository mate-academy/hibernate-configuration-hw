package mate.academy.dao;

import java.util.Optional;
import mate.academy.lib.Dao;
import mate.academy.lib.exception.DataProcessingException;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    private static final SessionFactory sessionFactory =
            HibernateUtil.getSessionFactory();

    @Override
    public Optional<Movie> get(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return Optional.ofNullable(session.get(Movie.class, id));
        } catch (Exception e) {
            throw new DataProcessingException("Can't show movie by id: " + id, e);
        }
    }

    @Override
    public Movie save(Movie movie) {
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
            throw new DataProcessingException("Fail to save the " + movie + " properly.", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return movie;
    }
}
