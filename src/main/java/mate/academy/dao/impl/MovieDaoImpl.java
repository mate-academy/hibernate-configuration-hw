package mate.academy.dao.impl;

import mate.academy.dao.MovieDao;
import mate.academy.model.Movie;

public class MovieDaoImpl extends AbstractDao implements MovieDao {
    public MovieDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Movie add(Movie movie) {
        return null;
    }

    @Override
    public Movie get(Long id) {
        return null;
    }
}
