package mate.academy.service;

import java.util.Optional;
import java.util.function.Supplier;
import mate.academy.DataProcessingException;
import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    private static final Injector INJECTOR = Injector.getInstance("mate");
    private final MovieDao movieDao;

    public MovieServiceImpl() {
        movieDao = (MovieDao) INJECTOR.getInstance(MovieDao.class);
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        Optional<Movie> movieOptional = movieDao.get(id);
        return movieOptional.orElseThrow((Supplier<RuntimeException>) ()
                -> new DataProcessingException("could not retrieve"
                    + " movie with id: " + id, null));
    }
}
