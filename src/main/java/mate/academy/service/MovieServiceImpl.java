package mate.academy.service;

import mate.academy.dao.MovieDao;
import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieDao movieDao;

    @Inject
    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow(
                () -> new DataProcessingException("Can't get movie by id " + id, new Exception())
        );
    }
}
