package mate.academy.dao.impl;

import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import mate.academy.dao.MovieDao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Transaction;

public class MovieDaoImpl implements MovieDao {
    private static final SessionFactory SESSION_FACTORY = HibernateUtil.getSessionFactory();

    @Override
    public Movie add(Movie movie) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = SESSION_FACTORY.openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
            return movie;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can`t add movie: " + movie, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Optional<Movie> get(Long id) {
        Session session = null;
        try {
            session = SESSION_FACTORY.openSession();
            Movie movie = session.get(Movie.class, id);
            return Optional.ofNullable(movie);
        } catch (Exception e) {
            throw new RuntimeException("Can`t get movie by id: " + id, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
