package mate.academy.dao;

import java.util.Optional;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    private static final Logger log = LogManager.getLogger(MovieDaoImpl.class);

    @Override
    public Movie add(Movie element) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(element);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            log.error("Can`t save to DB movie: {}", element, e);
            throw new DataProcessingException("Can`t save movie to DB " + element, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return element;
    }

    @Override
    public Optional<Movie> get(Long id) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
                Session session = sessionFactory.openSession()) {
            Movie movie = session.get(Movie.class, id);
            return Optional.ofNullable(movie);
        }
    }
}
