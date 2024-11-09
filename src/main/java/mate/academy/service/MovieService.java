package mate.academy.service;

import mate.academy.model.Movie;

import java.util.Optional;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);
}