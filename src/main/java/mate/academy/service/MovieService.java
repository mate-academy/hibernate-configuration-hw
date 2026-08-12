package mate.academy.service;

import mate.academy.entity.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);
}
