package mate.academy.dao;

import mate.academy.lib.Dao;
import mate.academy.model.Movie;
import java.util.Optional;

public interface MovieDao {
    @Dao
    Movie add(Movie movie);

    @Dao
    Optional<Movie> get(Long id);
}
