package mate.academy.service;

import mate.academy.model.Movie;

public interface MovieService {
    public Movie add(Movie movie);

    public Movie get(Long id);
}
