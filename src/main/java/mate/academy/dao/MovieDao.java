package mate.academy.dao;

import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import java.util.Optional;

@Dao
public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);
}
