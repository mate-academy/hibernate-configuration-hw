package mate.academy.moviedao;

import java.util.Optional;
import mate.academy.DataProcessingException;
import mate.academy.HibernateUtil;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
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
            session.persist(movie);
            transaction.commit();
        } catch (DataProcessingException e) {
            if (transaction != null) {
                transaction.rollback();
                throw new DataProcessingException(
                        "Transaction with movie " + movie + " rolling back.", e);
            }
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
            Movie movie = session.find(Movie.class, id);
            if (movie != null) {
                return Optional.of(movie);
            }
        } catch (DataProcessingException ex) {
            throw new DataProcessingException(
                    "Can't get movie with id " + id + " from database", ex);
        }
        return Optional.empty();
    }
}
