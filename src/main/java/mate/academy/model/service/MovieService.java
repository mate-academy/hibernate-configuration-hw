package mate.academy.model.service;

import mate.academy.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);
}
