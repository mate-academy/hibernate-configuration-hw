package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import java.util.Optional;

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
        Optional<Movie> movieOptional = movieDao.get(id);
        return movieOptional.orElseThrow(() -> new DataProcessingException("Movie with id: " + id + " didn't find"));
    }
}
