package mate.academy.lib.daopackage;

import java.util.Optional;
import mate.academy.lib.Dao;
import mate.academy.lib.Movie;
import mate.academy.lib.exception.DataProcessingException;
import mate.academy.lib.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie add(Movie movie) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(movie);
            transaction.commit();
            return movie;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't insert Movie entity", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }

    }

    @Override
    public Optional<Movie> get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Movie movie = session.get(Movie.class, id);
            if (movie == null) {
                return Optional.empty();
            }
            return Optional.of(movie);
        } catch (Exception e) {
            throw new DataProcessingException("Can't get data from DB", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

}
