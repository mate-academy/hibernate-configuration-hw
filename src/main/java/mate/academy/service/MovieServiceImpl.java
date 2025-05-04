package mate.academy.service;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.exeption.DataProcessingException;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        Optional<Movie> optionalOfMovie = movieDao.get(id);
        if (optionalOfMovie.isPresent()) {
            return optionalOfMovie.get();
        } else {
            throw new DataProcessingException("Can't find a movie with id " + id);
        }
    }
}
