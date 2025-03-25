package mate.academy.dao;

import java.util.Optional;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;

public interface MovieDao {
    @Dao
    Movie add(Movie movie);

    @Dao
    Optional<Movie> get(Long id);
}
