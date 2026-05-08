package mate.academy.dao;

import java.util.Optional;
import mate.academy.DataProcessingException;
import mate.academy.Movie;
import mate.academy.lib.Dao;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {

    @Override
    public Movie add(Movie movie) {
        SessionFactory sessionFactory = HibernateUtil.getsessionFactory();
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.persist(movie);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't save movie " + movie);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getsessionFactory();
        Session session = sessionFactory.openSession();
        Optional<Movie> optionalMovieFromDb = Optional.ofNullable(session.find(Movie.class, id));
        session.close();
        return optionalMovieFromDb;
    }
}
