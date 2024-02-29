package mate.academy.service;

import mate.academy.exceptions.DataProcessingException;
import mate.academy.model.Movie;

public interface MovieService {
    Movie add(Movie movie) throws DataProcessingException;

    Movie get(Long id);
}
