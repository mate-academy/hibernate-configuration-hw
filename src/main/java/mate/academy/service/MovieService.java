package mate.academy.service;

import mate.academy.lib.Dao;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import java.util.Optional;

@Service
@Dao
public interface MovieService {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);
}
