package mate.academy.dao;

import java.util.Optional;
import mate.academy.model.Movie;

public interface MovieDao {
    Movie add(Movie element);

    Optional<Movie> get(Long id);
}
