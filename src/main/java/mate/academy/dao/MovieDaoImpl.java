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
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
        } catch (Exception e) {
            assert transaction != null;
            transaction.rollback();
            throw new DataProcessingException("Data processing failure...", e);
        } finally {
            assert session != null;
            session.close();
        }
        return null;
    }

    @Override
    public Optional<Movie> get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            return Optional.of(session.get(Movie.class, id));
        } catch (Exception e) {
            assert transaction != null;
            transaction.rollback();
            throw new DataProcessingException("Data getting failure...", e);
        } finally {
            assert session != null;
            session.close();
        }
    }
}
