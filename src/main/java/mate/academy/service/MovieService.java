package mate.academy.service;

import mate.academy.domain.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);
}
