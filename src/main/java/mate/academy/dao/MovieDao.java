package mate.academy.dao;

import java.util.Optional;
import mate.academy.model.Movie;

public interface MovieDao {
    public Movie save(Movie movie);

    public Optional<Movie> get(Long id);
}
