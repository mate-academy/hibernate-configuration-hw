package mate.academy.dao;

import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Optional;

@Dao
public class MovieDaoImpl implements MovieDao {

    @Override
    public Movie add(Movie movie) {
        Session session = null;
        Transaction transaction = null;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't add movie: " + movie + " to the DB", e);
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
       try {SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
           session = sessionFactory.openSession();
           Movie movie = session.get(Movie.class, id);
           return Optional.ofNullable(movie);
       }
      catch (DataProcessingException e) {
               throw new DataProcessingException("Can't get movie by id " + id + " from the DB", e);
           }
       finally {
           if (session != null) {
               session.close();
           }
       }
    }
}
