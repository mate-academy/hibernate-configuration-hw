package mate.academy.service.impl;

import mate.academy.dao.MovieDao;
import mate.academy.entity.Movie;
import mate.academy.lib.Service;
import mate.academy.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieDao movieDao;

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
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
