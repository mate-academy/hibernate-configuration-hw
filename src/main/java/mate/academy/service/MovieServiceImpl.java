package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.model.Movie;

public class MovieServiceImpl implements MovieService {
    private MovieDao movieDao;

    public MovieServiceImpl() {
        movieDao = new MovieDaoImpl();
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow();
    }
}
