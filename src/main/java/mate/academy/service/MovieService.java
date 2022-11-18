package mate.academy.service;

import mate.academy.model.Movie;

public interface MovieService extends GenericService<Movie, Long> {
    @Override
    Movie get(Long id);

    @Override
    Movie add(Movie movie);
}
