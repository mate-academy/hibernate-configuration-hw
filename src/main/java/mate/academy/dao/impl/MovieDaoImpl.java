package mate.academy.dao.impl;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    private SessionFactory sessionFactory;
    private Session session;

    {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public Movie add(Movie movie) {
        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
        } catch (Exception e) {
            throw new DataProcessingException("Can`t add movie to DB " + movie);
        } finally {
            session.close();
            return movie;
        }

    }

    @Override
    public Optional<Movie> get(Long id) {
        Movie movie = null;
        try {
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            movie = session.get(Movie.class, id);
            transaction.commit();
        } catch (Exception e) {
            throw new DataProcessingException("Can`t get movie from DB by id " + id);
        } finally {
            session.close();
            return Optional.ofNullable(movie);
        }
    }
}
