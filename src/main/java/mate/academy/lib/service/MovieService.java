package mate.academy.lib.service;

import mate.academy.lib.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);
}

