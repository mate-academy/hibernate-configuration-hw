package mate.service;

import mate.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);
}
