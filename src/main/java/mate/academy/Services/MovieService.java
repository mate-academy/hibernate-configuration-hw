package mate.academy.Services;

import mate.academy.lib.Service;
import mate.academy.model.Movie;

public interface MovieService {
    @Service
    Movie add(Movie movie);

    @Service
    Movie get(Long id);
}
