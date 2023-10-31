package mate.academy.dao;

import java.util.Optional;
import mate.academy.lib.Dao;
import mate.academy.lib.Inject;
import mate.academy.model.Movie;
import mate.academy.service.exception.DataProcessingException;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Inject
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Movie add(Movie movie) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(movie);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw new DataProcessingException("Can't add the movie: " + movie);
        } finally {
            session.close();
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return Optional.ofNullable(session.get(Movie.class, id));
        } catch (Exception e) {
            throw new DataProcessingException("Can't find the movie by id: " + id);
        }
    }
}
