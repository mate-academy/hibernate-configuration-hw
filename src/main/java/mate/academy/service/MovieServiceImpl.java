package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.exceptions.DataProcessingException;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieDao movieDao;

    @Inject
    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }
    @Override
    public Movie add(Movie movie) {
        if (movie.getId() != null) {
            throw new DataProcessingException("New movies should not have ID set");
        }
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        Optional<Movie> movieOptional = movieDao.get(id);
        if (movieOptional.isPresent()) {
            return movieOptional.get();
        } else {
            throw new DataProcessingException("Movie with ID: " + id + " not found");
        }
    }
}
