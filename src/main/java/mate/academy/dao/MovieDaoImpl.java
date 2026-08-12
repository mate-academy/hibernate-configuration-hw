package mate.academy.dao;

import java.util.Optional;
import mate.academy.dao.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {

    private final SessionFactory factory = HibernateUtil.getSessionFactory();

    @Override
    public Movie add(Movie movie) {
        Session session = null;
        Transaction transaction = null;

        try {
            session = factory.openSession();
            transaction = session.beginTransaction();

            session.persist(movie);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Failed to save movie", e);
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
            session = factory.openSession();

            Movie movie = session.get(Movie.class, id);

            return Optional.ofNullable(movie);
        } catch (Exception e) {
            throw new DataProcessingException("Failed to find Movie with id: " + id, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
