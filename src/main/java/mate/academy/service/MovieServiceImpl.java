package mate.academy.service;

import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Service
public class MovieServiceImpl implements MovieService {
    @Override
    public Movie add(Movie movie) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Transaction transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
            session.close();
            return movie;
        } catch (Exception e) {
            throw new DataProcessingException("Can not connect to the DB");
        } finally {
            session.close();
        }
    }

    @Override
    public Movie get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            return session.get(Movie.class, id);
        } catch (Exception e) {
            throw new DataProcessingException("Can not connect to the DB");
        } finally {
            session.close();
        }
    }
}
