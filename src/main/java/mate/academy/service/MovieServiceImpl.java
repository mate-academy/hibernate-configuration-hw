package mate.academy.service;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Override
    public Movie add(Movie movie) {
        MovieDao movieDao = new MovieDaoImpl();
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        MovieDao movieDao = new MovieDaoImpl();
        Optional<Movie> movie = movieDao.get(id);
        if (movie.isPresent()) {
            return movie.get();
        } else {
            throw new DataProcessingException("Cannot find movie");
        }
    }
}
