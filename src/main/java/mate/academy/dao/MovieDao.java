package mate.academy.dao;

import java.util.Optional;
import mate.academy.lib.exception.DataProcessingException;
import mate.academy.model.Movie;

public interface MovieDao {
    Movie save(Movie movie) throws DataProcessingException;

    Optional<Movie> get(Long id) throws DataProcessingException;
}
