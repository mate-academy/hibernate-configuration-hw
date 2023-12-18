package mate.academy.service;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private final MovieDao movieDao = new MovieDaoImpl();

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        Optional<Movie> optionalMovie = movieDao.get(id);
        if (optionalMovie.isPresent()) {
            return optionalMovie.get();
        } else {
            throw new DataProcessingException("No movie found by id " + id);
        }
    }
}
