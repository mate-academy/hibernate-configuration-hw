package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.exceptions.MovieNotFoundException;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Override
    public Movie add(Movie movie) {
        validateNotNull(movie, "Movie can't be null");
        MovieDao movieDao = new MovieDaoImpl();
        movieDao.add(movie);
        return movie;
    }

    @Override
    public Movie get(Long id) {
        validateNotNull(id, "Id can't be null.");
        MovieDao movieDao = new MovieDaoImpl();
        return movieDao.get(id).orElseThrow(() -> new MovieNotFoundException("Movie with id "
                + id + " not found"));
    }

    private void validateNotNull(Object value, String message) {
        if (value == null) {
            throw new IllegalArgumentException(message);
        }
    }
}
