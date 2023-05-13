package mate.academy.dao;

import java.io.Serializable;
import java.util.Optional;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Movie add(Movie movie) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Serializable save = session.save(movie);
            transaction.commit();
            System.out.println(save);

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can not add Movie to DB. " + movie, e);

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
        Movie movie;
        try {
            session = sessionFactory.openSession();
            movie = session.get(Movie.class, id);
        } catch (Exception e) {
            throw new DataProcessingException("Can not get Movie from DB with movieId = " + id, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return Optional.ofNullable(movie);
    }
}
