package mate.academy.servise;

import mate.academy.lib.Service;
import mate.academy.model.Movie;

public interface MovieService {

    @Service
    Movie add(Movie movie);

    Movie get(Long id);
}
