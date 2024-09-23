package mate.academy.movieservice;

import java.util.NoSuchElementException;
import java.util.Optional;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import mate.academy.moviedao.MovieDao;

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
        Optional<Movie> movieById = movieDao.get(id);
        return movieById
                .orElseThrow(() -> new NoSuchElementException("Movie not found"));
    }
}
