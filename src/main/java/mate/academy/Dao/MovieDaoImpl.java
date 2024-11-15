package mate.academy.Dao;

import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.SessionFactory;

import java.util.Optional;

public class MovieDaoImpl implements MovieDao{
    @Override
    public Movie add(Movie movie) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        return null;
    }

    @Override
    public Optional<Movie> get(Long id) {
        return Optional.empty();
    }
}
