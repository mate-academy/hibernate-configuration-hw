package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Inject;
import mate.academy.model.Movie;

public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        Movie movie = movieDao.get(id).get();
        if (movie == null) {
            throw new DataProcessingException("Movie by id: " + id + " doesn't exist.");
        }
        return movie;
    }
}
