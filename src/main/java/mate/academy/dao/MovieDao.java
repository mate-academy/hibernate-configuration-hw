package mate.academy.dao;

import java.util.Optional;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;

@Dao
public interface MovieDao {
    public Movie add(Movie movie);

    Optional<Movie> get(Long id);
}
