package mate.academy.services.movieservice;

import java.util.NoSuchElementException;
import mate.academy.dao.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    private static final String EXCEPTION_MESSAGE = "Can't get movie by id=";
    @Inject
    private MovieDao movieDao;

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow(
                    () -> new NoSuchElementException(EXCEPTION_MESSAGE + id));
    }
}
