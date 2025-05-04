package mate.academy.dao;

import java.util.Optional;
import mate.academy.exceptions.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Movie add(Movie movie) {
        Session currentSession = null;
        Transaction transaction = null;
        try {
            currentSession = sessionFactory.openSession();
            transaction = currentSession.beginTransaction();
            currentSession.save(movie);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't open connection");
        } finally {
            currentSession.close();
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        try (Session currentSession = sessionFactory.openSession();) {
            Movie movie = currentSession.get(Movie.class, id);
            return Optional.ofNullable(movie);
        } catch (Exception e) {
            throw new DataProcessingException("Can't open connection");
        }

    }
}
