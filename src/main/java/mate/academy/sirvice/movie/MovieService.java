package mate.academy.sirvice.movie;

import mate.academy.model.Movie;

public interface MovieService {
    Movie get(Long id);

    Movie add(Movie movie);
}
