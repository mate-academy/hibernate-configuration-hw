package mate.academy.dao;

import java.util.Optional;
import mate.academy.exceptions.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {

    @Override
    public Movie add(Movie movie) {
        Session session = null;
        Transaction transaction = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }

            throw new DataProcessingException("Can't add the movie: " + movie.getTitle(), ex);
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        Movie movie = null;
        Session session = null;
        Transaction transaction = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            movie = session.get(Movie.class, id);
        } catch (Exception ex) {
            throw new DataProcessingException("Can't get the movie with ID: " + id, ex);
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return Optional.ofNullable(movie);
    }
}
