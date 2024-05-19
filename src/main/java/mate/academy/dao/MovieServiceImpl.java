package mate.academy.dao;

import mate.academy.lib.DataProcessingException;
import mate.academy.lib.Inject;
import mate.academy.lib.MovieService;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Inject
@Service
public class MovieServiceImpl implements MovieService {
    @Override
    public Movie add(Movie movie) throws DataProcessingException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(movie);
        } catch (Exception e) {
            transaction.rollback();
            session.close();
            throw new DataProcessingException("Can't add movie");
        }
        transaction.commit();
        session.close();
        return movie;
    }

    @Override
    public Movie get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Movie movie = session.get(Movie.class, id);
        session.getTransaction().commit();
        session.close();
        return movie;
    }
}
