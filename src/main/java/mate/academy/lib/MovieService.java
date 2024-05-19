package mate.academy.lib;

import mate.academy.model.Movie;

public interface MovieService {
    Movie add(Movie movie) throws DataProcessingException;

    Movie get(Long id);
}
