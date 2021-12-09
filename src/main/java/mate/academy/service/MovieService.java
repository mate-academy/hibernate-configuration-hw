package mate.academy.service;

import mate.academy.model.Movie;

public interface MovieService {

    Movie save(Movie element);

    Movie get(Long id);
}
