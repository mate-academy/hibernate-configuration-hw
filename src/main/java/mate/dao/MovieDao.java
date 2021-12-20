package mate.dao;

import java.util.Optional;
import mate.model.Movie;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);
}
