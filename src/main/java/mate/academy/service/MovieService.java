package mate.academy.service;

import mate.academy.Movie;

public interface MovieService {

    Movie add(Movie movie);

    Movie get(Long id);
}
