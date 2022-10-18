package mate.academy.service;

import mate.academy.exception.DataProcessingException;
import mate.academy.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);
}
