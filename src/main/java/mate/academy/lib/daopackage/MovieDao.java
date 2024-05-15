package mate.academy.lib.daopackage;

import java.util.Optional;
import mate.academy.lib.Movie;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);
}
