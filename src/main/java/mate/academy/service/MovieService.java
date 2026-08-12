package mate.academy.service;

import mate.academy.model.Movie;

public interface MovieService {
    Movie get(Long id);

    Movie add(Movie movie);
}
