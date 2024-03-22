package mate.academy.service;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Override
    public Optional<Movie> add(Movie movie, MovieDao movieDao) {
        this.movieDao = movieDao;
        return Optional.of(movieDao.add(movie));
    }

    @Override
    public Optional<Movie> get(Long id, MovieDao movieDao) {
        this.movieDao = movieDao;
        return movieDao.get(id);
    }
}
