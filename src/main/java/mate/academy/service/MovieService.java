package mate.academy.service;

import java.util.Optional;
import mate.academy.model.Movie;

public interface MovieService {
    Movie add(Movie movie);
    Optional<Movie> get(Long id);
}
