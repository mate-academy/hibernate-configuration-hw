package mate.academy.dao;

import java.util.Optional;
import mate.academy.model.Movie;

public interface MovieDao {
    Movie addMovie(Movie movie);

    Optional<Movie> get(int id);
}
