package mate.academy.dao.impl;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.SessionFactory;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie add(Movie movie) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        factory.inTransaction(session -> {
            session.persist(movie);
        });
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Optional<Movie> movie = factory.fromTransaction(session ->
                Optional.ofNullable(session.find(Movie.class, id)));
        if (movie.isEmpty()) {
            throw new DataProcessingException("No such movie. ID = " + id);
        }
        return movie;
    }
}
