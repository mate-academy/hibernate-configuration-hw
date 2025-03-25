package mate.academy.dao;

import mate.academy.DataProcessingException;
import java.util.Optional;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MovieDaoImpl implements MovieDao {
    private Session session = null;
    private Transaction transaction = null;

    @Dao
    @Override
    public Movie add(Movie movie) {
        try {
            session = HibernateUtil.getInstance().openSession();
            transaction = session.beginTransaction();

            transaction.begin();
            session.save(movie);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            try {
                throw new DataProcessingException("Can not add movie", e);
            } catch (DataProcessingException ex) {
                throw new RuntimeException(ex);
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return movie;
    }

    @Dao
    @Override
    public Optional<Movie> get(Long id) {
        Optional<Movie> movie = null;
        try {
            session = HibernateUtil.getInstance().openSession();
            movie = Optional.of(session.get(Movie.class, id));
        } catch (Exception e) {
            try {
                throw new DataProcessingException("Can not get an movie", e);
            } catch (DataProcessingException ex) {
                throw new RuntimeException(ex);
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return movie;
    }
}
