package mate.academy.lib.servicepackage;

import mate.academy.lib.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);
}

