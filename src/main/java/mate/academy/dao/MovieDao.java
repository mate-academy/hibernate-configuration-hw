package mate.academy.dao;

import java.util.Optional;
import mate.academy.model.Movie;
import mate.academy.util.exceptions.DataProcessingException;

public interface MovieDao {
    Movie add(Movie movie) throws DataProcessingException;

    Optional<Movie> get(Long id) throws DataProcessingException;
}
