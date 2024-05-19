package mate.academy.dao;

import java.util.Optional;
import mate.academy.lib.Dao;
import mate.academy.lib.DataProcessingException;
import mate.academy.lib.MovieDao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie add(Movie movie) throws DataProcessingException {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        try {
            session.save(movie);
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            throw new DataProcessingException("Can't add movie");
        }
        session.getTransaction().commit();
        session.close();
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Movie movie = session.get(Movie.class, id);
        session.getTransaction().commit();
        session.close();
        return Optional.ofNullable(movie);
    }
}
