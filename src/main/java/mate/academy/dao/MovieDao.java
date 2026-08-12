package mate.academy.dao;

import java.util.Optional;
import mate.academy.Movie;

public interface MovieDao {

    Movie add(Movie movie);

    Optional<Movie> get(Long id);
}
