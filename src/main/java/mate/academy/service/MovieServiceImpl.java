package mate.academy.service;

import java.util.Optional;
import mate.academy.Main;
import mate.academy.dao.MovieDao;
import mate.academy.lib.DataProcessingException;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    private MovieDao movieDao = (MovieDao) Main.injector.getInstance(MovieDao.class);

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        Optional<Movie> movieOptional = movieDao.get(id);
        if (movieOptional.isPresent()) {
            return movieOptional.get();
        }
        throw new DataProcessingException("Not found in DB movie with id = " + id);
    }
}
