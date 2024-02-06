package mate.academy.dao;

import java.util.Optional;
import mate.academy.lib.Dao;
import mate.academy.lib.Inject;
import mate.academy.model.Movie;

@Inject
@Dao
public interface MovieDao {

    Movie add(Movie movie);

    Optional<Movie> get(Long id);
}
