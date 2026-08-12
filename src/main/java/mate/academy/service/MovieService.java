package mate.academy.service;

import mate.academy.model.Movie;

public interface MovieService extends GenericService<Movie> {
    @Override
    Movie add(Movie element);

    @Override
    Movie get(Long id);
}
