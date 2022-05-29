package mate.academy.dao;

import java.util.Optional;
import java.util.zip.DataFormatException;
import mate.academy.model.Movie;

public interface MovieDao {
    Movie add(Movie movie) throws DataFormatException;
  
    Optional<Movie> get(Long id);
}
