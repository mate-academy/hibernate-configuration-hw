package mate.academy.dao;

import static mate.academy.util.HibernateUtil.getSessionFactory;

import java.util.Optional;
import mate.academy.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {

    private final SessionFactory sessionFactory;

    public MovieDaoImpl() {
        sessionFactory = getSessionFactory();
    }

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
            throw new DataProcessingException("can't add movie.", e);
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
            return Optional.ofNullable(session.get(Movie.class, id));
        } catch (Exception e) {
            throw new DataProcessingException("can't get movie.", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
