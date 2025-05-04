package mate.academy.dao;

import java.util.Optional;
import mate.academy.lib.DataProcessingException;
import mate.academy.model.Movie;

public interface MovieDao {
    Movie add(Movie movie) throws DataProcessingException;

    Optional<Movie> get(Long id);
}
