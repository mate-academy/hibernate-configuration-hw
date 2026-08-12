package mate.academy.dao;

import java.util.Optional;
import mate.academy.model.Movie;

public interface MovieDao {

    Optional<Movie> get(Long id);

    Movie add(Movie movie);
}
