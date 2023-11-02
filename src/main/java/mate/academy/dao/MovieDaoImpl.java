package mate.academy.dao;

import java.util.Optional;
import mate.academy.exeptions.DataProcessingException;
import mate.academy.lib.Inject;
import mate.academy.model.Movie;
import mate.academy.connection.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Inject
    private MovieDao movieDao;

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
            throw new DataProcessingException("Cant add movie to DB" + e);
        } finally {
            assert session != null;
            session.close();
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return Optional.ofNullable(session.get(Movie.class, id));
        } catch (Exception e) {
            throw new DataProcessingException("Can't get movie by id: " + id, e);
        }
    }
}
