package mate.academy.dao;

import java.util.Optional;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie add(Movie movie) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(movie);
            transaction.commit();
        } catch (Exception e) {
            throw new DataProcessingException("Cannot save movie: ", e);
        } finally {
            transaction.rollback();
            session.close();
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        Movie movie;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            movie = session.get(Movie.class, id);
        }
        return Optional.ofNullable(movie);
    }
}
