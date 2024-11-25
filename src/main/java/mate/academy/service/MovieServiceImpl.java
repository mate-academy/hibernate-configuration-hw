package mate.academy.service;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.lib.Injector;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import mate.academy.util.DataProcessingException;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieDao movieDao =
            (MovieDao) Injector.getInstance("mate.academy.dao.MovieDaoImpl")
            .getInstance(MovieDao.class);

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        Optional<Movie> optionalMovie = movieDao.get(id);
        if (optionalMovie.isPresent()) {
            return optionalMovie.get();
        } else {
            throw new DataProcessingException("Cant find object by id:" + id);
        }
    }
}
