package mate.academy.dao;

import mate.academy.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.models.Movie;
import java.util.Optional;

public interface MovieDao {
    Movie add(Movie movie) throws DataProcessingException;

    Optional<Movie> get(Long id) throws DataProcessingException;
}
