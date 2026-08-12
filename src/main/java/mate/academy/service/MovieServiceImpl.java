package mate.academy.service;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import mate.academy.util.DataProcessingException;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        if (movie == null) {
            throw new DataProcessingException("Movie can't be null");
        }
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        if (id == null) {
            throw new DataProcessingException("Id can't be null");
        }
        Optional<Movie> movieOptional = movieDao.get(id);
        return movieOptional.orElseThrow(() ->
                new DataProcessingException("Can't find movie by id " + id));
    }
}
