package mate.academy.dao;

import java.util.Optional;

import mate.academy.lib.Dao;
import mate.academy.model.Movie;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie add(Movie movie) {
        return null;
    }

    @Override
    public Optional<Movie> get(Long id) {
        return Optional.empty();
    }
}
