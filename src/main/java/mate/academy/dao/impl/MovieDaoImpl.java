package mate.academy.dao.impl;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.service.impl.MovieServiceImpl;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Dao
public class MovieDaoImpl implements MovieDao {
    private static final Logger log = LoggerFactory.getLogger(MovieServiceImpl.class);

    @Override
    public Movie add(Movie movie) {
        log.info("Adding movie: {}", movie);
        Transaction transaction = null;
        try (var session = createSession()) {
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
            log.info("Movie added successfully: {}", movie);
            return movie;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            log.error("Failed to add movie: {}", movie, e);
            throw new DataProcessingException("Unable to add movie:" + movie, e);
        }
    }

    @Override
    public Optional<Movie> get(Long id) {
        log.info("Fetching movie by id: {}", id);
        try (var session = createSession()) {
            var movie = session.get(Movie.class, id);
            return Optional.ofNullable(movie);
        } catch (Exception e) {
            log.error("Failed to get movie by id: {}", id, e);
            throw new DataProcessingException("Unable to get movie by id: " + id, e);
        }
    }

    public Session createSession() {
        log.info("Method createSession was called");
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        log.info("Session has been created: {}", session);
        return session;
    }
}
