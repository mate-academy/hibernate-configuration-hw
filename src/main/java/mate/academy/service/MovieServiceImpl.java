package mate.academy.service;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.exeptions.DataProcessingException;
import mate.academy.lib.Injector;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    private static final Injector injector = Injector.getInstance("mate.academy");

    private final MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);

    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        Optional<Movie> movieOptional = movieDao.get(id);
        if (movieOptional.isEmpty()) {
            throw new DataProcessingException("Movie with id = " + id + " no exist.");
            //return new Movie();
        }
        return movieOptional.get();
    }
}
