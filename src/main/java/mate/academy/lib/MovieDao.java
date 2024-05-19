package mate.academy.lib;

import java.util.Optional;
import mate.academy.model.Movie;

public interface MovieDao {
    Movie add(Movie movie) throws DataProcessingException;

    Optional<Movie> get(Long id);
}
