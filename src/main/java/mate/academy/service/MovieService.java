package mate.academy.service;

import java.util.List;
import mate.academy.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    Movie update(Movie movie);

    List<Movie> getAll();

    Movie delete(Movie movie);
}
