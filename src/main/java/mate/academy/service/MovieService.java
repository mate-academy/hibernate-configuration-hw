package mate.academy.service;

import mate.academy.model.Movie;

public interface MovieService {
    Movie add(Movie movie) throws Exception;

    Movie get(Long id);
}
