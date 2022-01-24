package mate.academy.dao;

import mate.academy.DataProcessingException;
import java.util.Optional;
import mate.academy.models.Movie;

public interface MovieDao {
    Movie add(Movie movie) throws DataProcessingException;

    Optional<Movie> get(Long id) throws DataProcessingException;
}
