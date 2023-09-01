package mate.academy.service;

import mate.academy.models.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);
}
