package mate.academy.dao.impl;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.exceptions.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.lib.Inject;
import mate.academy.model.Movie;
import mate.academy.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    private final SessionFactory sessionFactory;

    @Inject
    public MovieDaoImpl() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Inject
    public MovieDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Movie add(Movie movie) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                session.save(movie);
                transaction.commit();
                return movie;
            } catch (Exception e) {
                transaction.rollback();
                throw new DataProcessingException("Failed to add movie: " + e.getMessage(), e);
            }
        }
    }



    @Override
    public Optional<Movie> get(Long id) {
        try (Session session = sessionFactory.openSession()) {
            Movie movie = session.get(Movie.class, id);
            return Optional.ofNullable(movie);
        } catch (Exception e) {
            throw new DataProcessingException("Error occurred while retrieving"
                    + " the movie from the database", e);
        }
    }
}
