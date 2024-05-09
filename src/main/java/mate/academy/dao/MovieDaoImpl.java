package mate.academy.dao;

import java.util.Optional;
import mate.academy.DataProcessingException;
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

        } catch (RuntimeException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can not save movie to Database: "
                    + movie.toString(), e);
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
            Movie movie = session.find(Movie.class, id);
            return Optional.of(movie);
        } catch (RuntimeException e) {
            throw new DataProcessingException("Can not find movie by id: " + id, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
