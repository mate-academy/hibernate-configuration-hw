package mate.academy.moviedao;

import mate.academy.model.Movie;

import java.util.Optional;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> getById(Long id);
}
