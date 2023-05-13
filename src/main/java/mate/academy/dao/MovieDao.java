package mate.academy.dao;

import java.util.Optional;
import mate.academy.model.Movie;

public interface MovieDao extends GenericDao<Movie> {
    @Override
    Movie add(Movie movie);

    @Override
    Optional<Movie> get(Long id);
}
