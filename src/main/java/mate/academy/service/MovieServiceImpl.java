package mate.academy.service;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.lib.Dao;
import mate.academy.lib.Inject;
import mate.academy.model.Movie;

@Dao
public class MovieServiceImpl implements MovieService {
    private static final String GET_EXCEPTION_MESSAGE = "Can`t find movie with id: ";
    @Inject
    private MovieDao movieDao;

    public MovieServiceImpl() {
    }

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        Optional<Movie> optionalMovie = movieDao.get(id);
        return optionalMovie.orElseThrow(()
                -> new IllegalArgumentException(GET_EXCEPTION_MESSAGE + id));
    }
}
