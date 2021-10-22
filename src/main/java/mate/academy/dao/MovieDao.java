package mate.academy.dao;

import java.util.Optional;
import mate.academy.model.Movie;

public interface MovieDao {
    Movie save(Movie movie);

    Optional<Movie> get(Long id);
}
