package mate.academy.dao;

import mate.academy.exceptions.DataProcessingException;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Optional;

public class MovieDaoImpl implements MovieDao {
    private final SessionFactory sessionFactory;

    public MovieDaoImpl() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public Movie add(Movie movie) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Long id = (Long) session.save(movie);
            session.getTransaction().commit();
            movie.setId(id);
        } catch (Exception e) {
            throw new DataProcessingException("Error while adding a movie", e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        Session session = sessionFactory.openSession();
        try {
            return Optional.ofNullable(session.get(Movie.class, id));
        } catch (Exception e) {
            throw new DataProcessingException("Error while getting a movie by ID", e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}
