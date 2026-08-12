package mate.academy.dao;

import java.util.Optional;
import mate.academy.entity.Movie;
import mate.academy.lib.Dao;

@Dao
public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);
}
