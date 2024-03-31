package mate.academy.dao;

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
    @Override
    public Movie add(Movie movie) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(movie);
            transaction.commit();
            return movie;
        } catch (Exception e) {
            transaction.rollback();
            throw new DataProcessingException("Can not complete saving:" + movie.getTitle(), e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Optional<Movie> get(Long id) {
        try (Session session = getSession()) {
            return Optional.ofNullable(session.get(Movie.class, id));
        } catch (Exception e) {
            throw new DataProcessingException("Can't get from database movie by id: " + id, e);
        }
    }

    private static Session getSession() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        return sessionFactory.openSession();
    }
}
