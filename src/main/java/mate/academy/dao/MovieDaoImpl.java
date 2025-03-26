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
    private static final SessionFactory sessionFactory = HibernateUtil.getsessionFactory();
    private static Session session = null;
    private static Transaction transaction = null;

    @Override
    public Movie add(Movie movie) {
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't add " + movie.getTitle() + " movie to DB", e);
        } finally {
            session.close();
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        try {
            session = sessionFactory.openSession();
            Optional<Movie> movie = Optional.ofNullable(session.get(Movie.class, id));
            return movie;
        } catch (Exception e) {
            throw new DataProcessingException("Can't get movie with id: " + id + " from DB", e);
        }
    }
}
