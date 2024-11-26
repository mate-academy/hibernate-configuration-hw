package mate.academy.dao;

import java.util.Optional;
import mate.academy.DataProcessingExeption;
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
        if (movie == null) {
            throw new RuntimeException("unacceptable data");
        }

        if (movie.getId() != null && get(movie.getId()).isPresent()) {
            throw new RuntimeException(movie + "already existed in database");
        }

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = null;
        Transaction transaction = null;

        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingExeption("adding " + movie + " into database failed");
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = null;
        Movie movie = null;
        try {
            session = sessionFactory.openSession();
            movie = session.get(Movie.class, id);
        } catch (Exception e) {

            throw new DataProcessingExeption("getting " + id + " from database failed");
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return Optional.ofNullable(movie);
    }

    @Override
    public Boolean update(Movie movie) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = null;
        Transaction transaction = null;

        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.update(movie);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingExeption("adding " + movie + " into database failed");
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return true;
    }

    @Override
    public Boolean delete(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = null;
        Transaction transaction = null;

        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.delete(get(id)
                    .orElseThrow(() -> new RuntimeException("now object with id " + id)));
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingExeption("removing movie with id: "
                    + id + " from database failed");
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return true;
    }
}
