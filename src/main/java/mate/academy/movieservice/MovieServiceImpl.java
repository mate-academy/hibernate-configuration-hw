package mate.academy.movieservice;

import java.util.Optional;
import mate.academy.DataProcessingException;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import mate.academy.moviedao.MovieDao;
import mate.academy.moviedao.MovieDaoImpl;

@Service
public class MovieServiceImpl implements MovieService {

    private MovieDao movieDao = new MovieDaoImpl();

    @Override
    public Movie add(Movie movie) {
        movieDao.add(movie);
        Optional<Movie> addedMovie = movieDao.get(movie.getId());
        if (addedMovie.isPresent()) {
            return addedMovie.get();
        }
        return addedMovie.orElseThrow(() -> new DataProcessingException(
                "Movie " + movie + "wasn't added to the database", null));
    }

    @Override
    public Movie get(Long id) {
        Optional<Movie> movie = movieDao.get(id);
        if (movie.isPresent()) {
            return movie.get();
        }
        return movie.orElseThrow(() -> new DataProcessingException(
                "Movie with id " + id + " does not exist", null));
    }
}
