package mate.academy.services;

import mate.academy.model.Movie;

public interface MovieService {
    Movie save(Movie movie);

    Movie get(Long id);
}
