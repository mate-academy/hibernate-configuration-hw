package mate.academy.dao;

import java.util.Optional;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Service
public class MovieDaoImpl implements MovieDao {

    @Override
    public Movie add(Movie movie) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = getSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't add Movie to DB: movie - "
                    + movie.getTitle(), e);
        } finally {
            if (session != null) {
                session.close();
            }

        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        Optional<Movie> optionalMovie;
        try (Session session = getSession()) {
            optionalMovie = Optional.of(session.get(Movie.class, id));
        } catch (Exception e) {
            throw new DataProcessingException("Can't get Movie from DB by id: " + id, e);
        }
        return optionalMovie;
    }

    private Session getSession() {
        return HibernateUtil.getSessionFactory().openSession();
    }
}
