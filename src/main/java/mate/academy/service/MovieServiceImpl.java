package mate.academy.service;

import mate.academy.dao.DataProcessingException;
import mate.academy.dao.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.model.Movie;

public class MovieServiceImpl implements MovieService {

    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        try {
            return movieDao.add(movie);
        } catch (DataProcessingException e) {
            throw new DataProcessingException("Error adding movie", e);
        }
    }

    @Override
    public Movie get(Long id) {
        try {
            return movieDao.get(id).orElse(null);
        } catch (DataProcessingException e) {
            throw new DataProcessingException("Error getting movie by id", e);
        }
    }
}
