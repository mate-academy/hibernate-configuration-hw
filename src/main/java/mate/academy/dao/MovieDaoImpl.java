package mate.academy.dao;

import java.util.Optional;
import mate.academy.data.processing.exception.DataProcessingException;
import mate.academy.hibernate.util.HibernateUtil;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie add(Movie movie) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't add movie to DataBase, rollback performed", e);
        } finally {
            session.close();
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        Optional<Movie> optionalMovie = Optional.empty();
        try {
            transaction = session.beginTransaction();
            Movie movie = session.get(Movie.class, id);
            optionalMovie = Optional.ofNullable(movie);
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't add movie to DataBase, rollback performed", e);
        } finally {
            session.close();
        }
        return optionalMovie;
    }
}
