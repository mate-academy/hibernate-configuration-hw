package mate.academy.service;

import mate.academy.model.Movie;

public interface MovieService {
    Movie create(Movie movie);

    Movie get(Long id);
}
