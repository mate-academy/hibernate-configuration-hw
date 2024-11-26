package mate.academy.service;

import mate.academy.model.Movie;

public interface MovieService {

    Movie add(Movie movie);

    Boolean update(Movie movie);

    Movie get(Long id);

    Boolean delete(Long id);
}
