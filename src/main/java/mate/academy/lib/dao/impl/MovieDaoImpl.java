package mate.academy.lib.dao.impl;

import java.util.Optional;
import mate.academy.lib.Dao;
import mate.academy.lib.DataProcessingException;
import mate.academy.lib.HibernateUtil;
import mate.academy.lib.dao.MovieDao;
import mate.academy.lib.model.Movie;
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
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Could not save movie: " + movie, ex);
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        Session session = null;
        Optional<Movie> movie = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            movie = Optional.ofNullable(session.get(Movie.class, id));
        } catch (Exception ex) {
            throw new DataProcessingException("Could not save movie: " + movie, ex);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return movie;
    }
}
