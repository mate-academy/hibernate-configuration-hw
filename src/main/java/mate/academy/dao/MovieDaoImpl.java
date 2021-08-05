package mate.academy.dao;

import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Dao;
import mate.academy.model.Movie;

import java.util.Optional;

@Dao
public class MovieDaoImpl implements MovieDao {

    @Override
    public Movie add(Movie movie) {
        try {
            return null;
        } catch (Exception e) {
            throw new DataProcessingException();
        }
    }

    @Override
    public Optional<Movie> get(Long id) {
        try {
            return Optional.empty();
        } catch (Exception e) {
            throw new DataProcessingException();
        }
    }
}
