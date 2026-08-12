package mate.academy.service;

import mate.academy.dao.MovieDaoImpl;
import mate.academy.model.Movie;

public class MovieServiceImpl implements MovieService {

    private final MovieDaoImpl movieDao = new MovieDaoImpl();

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElse(null);
    }
}
