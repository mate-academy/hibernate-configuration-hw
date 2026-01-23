package mate.academy.dao.impl;

import java.util.Optional;
import mate.academy.dao.MovieDao;
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
        Session session = null;
        Transaction transition = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transition = session.beginTransaction();
            session.persist(movie);
            transition.commit();
            return movie;
        } catch (Exception e) {
            if (transition != null) {
                transition.rollback();
            }
            throw new DataProcessingException("Can't add movie:" + movie, e);
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
            session = HibernateUtil.getSessionFactory().openSession();
            return Optional.ofNullable(session.get(Movie.class, id));
        } catch (Exception e) {
            throw new DataProcessingException(
                    "Could not get movie with id: " + id, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }

    }
}
