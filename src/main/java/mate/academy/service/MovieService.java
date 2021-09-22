package mate.academy.service;

import mate.academy.model.Movie;

import java.util.List;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    Movie update(Movie movie);

    List<Movie> getAll();

    Movie delete(Movie movie);
}
