package mate.academy.services;

import mate.academy.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);
}
