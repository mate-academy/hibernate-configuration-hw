package mate.academy.dao;

import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Optional;

public class MovieDaoImpl implements MovieDao {
    private Session session = null;
    private Transaction transaction = null;

    @Override
    public Movie add(Movie movie) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.persist(movie);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Optional<Movie> movie = Optional.ofNullable(session.get(Movie.class, id));
            session.close();
            return movie;
        } catch (Exception e) {
            throw new RuntimeException("Can't get Optional<Movie> object from DB, id =" + id, e);
        }
    }
}
