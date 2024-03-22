package mate.academy.service;

import java.util.Optional;
import mate.academy.dao.MovieDao;
import mate.academy.model.Movie;

public interface MovieService {
    public Movie add(Movie movie, MovieDao movieDao);

    Optional<Movie> get(Long id, MovieDao movieDao);
}
