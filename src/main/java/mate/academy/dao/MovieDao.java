package mate.academy.dao;

import mate.academy.model.Movie;

import java.util.Optional;

public interface MovieDao {

    Movie save(Movie movie);

    Optional<Movie> get(Long id);
}
