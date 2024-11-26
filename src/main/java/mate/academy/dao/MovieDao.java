package mate.academy.dao;

import java.util.Optional;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;

@Dao
public interface MovieDao {

    Movie add(Movie move);

    Optional<Movie> get(Long id);

    Boolean update(Movie movie);

    Boolean delete(Long id);
}
