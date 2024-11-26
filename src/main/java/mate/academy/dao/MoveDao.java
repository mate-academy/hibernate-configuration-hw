package mate.academy.dao;

import java.util.Optional;
import mate.academy.model.Movie;

public interface MoveDao {

    Movie add(Movie move);

    Optional<Movie> get(Long id);

    Boolean update(Movie movie);

    Boolean delete(Long id);
}
