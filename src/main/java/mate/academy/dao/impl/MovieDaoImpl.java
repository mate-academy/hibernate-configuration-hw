package mate.academy.dao.impl;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.entity.Movie;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.utility.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    public static final String CAN_T_ADD_MOVIE_TO_DATABASE_MSG = "Can't add movie to database ";
    public static final String CAN_T_GET_MOVIE_BY_ID_MSG = "Can't get movie by ID: ";

    @Override
    public Movie add(Movie movie) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();

            session.persist(movie);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException(CAN_T_ADD_MOVIE_TO_DATABASE_MSG, e);
        } finally {
            session.close();
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.getTransaction();
            Movie movie = session.get(Movie.class, id);
            return Optional.ofNullable(movie);
        } catch (RuntimeException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException(CAN_T_GET_MOVIE_BY_ID_MSG + id, e);
        }
    }
}
