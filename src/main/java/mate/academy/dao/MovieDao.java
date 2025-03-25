package mate.academy.dao;

import mate.academy.lib.Dao;
import java.util.Optional;
import mate.academy.model.Movie;


public interface MovieDao {
    @Dao
    Movie add(Movie movie);

    @Dao
    Optional<Movie> get(Long id);
}
