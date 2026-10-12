package mate.academy.dao;

import java.util.Optional;
import mate.academy.lib.Dao;
import mate.academy.lib.DataProcessingException;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie add(Movie movie) {
        SessionFactory sf = HibernateUtil.getInstance();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            Long id = (Long) session.save(movie);
            transaction.commit();

            movie.setId(id);

            return movie;
        } catch (Exception e) {
            transaction.rollback();
            throw new DataProcessingException("Can't add movie " + movie, e);
        } finally {
            session.close();

        }
    }

    @Override
    public Optional<Movie> get(Long id) {
        SessionFactory sf = HibernateUtil.getInstance();
        Session session = sf.openSession();
        try {
            return Optional.ofNullable(session.get(Movie.class, id));
        } catch (Exception e) {
            throw new DataProcessingException("Can't find movie with id " + id, e);
        } finally {
            session.close();
        }
    }
}
