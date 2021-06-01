package mate.academy.service;

import mate.academy.model.Movie;
import mate.academy.util.exceptions.DataProcessingException;

public interface MovieService {
    Movie add(Movie movie) throws DataProcessingException;

    Movie get(Long id) throws DataProcessingException;
}
