package mate.academy.lib.service;

import java.util.Optional;
import mate.academy.lib.DataProcessingException;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.lib.dao.MovieDao;
import mate.academy.lib.model.Movie;

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
        Optional<Movie> movie = movieDao.get(id);
        if (movie.isPresent()) {
            return movie.get();
        } else {
            throw new DataProcessingException("Movie not found with id: " + id);
        }
    }
}
