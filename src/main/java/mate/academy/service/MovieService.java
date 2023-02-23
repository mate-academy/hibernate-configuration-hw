package mate.academy.service;

import java.util.zip.DataFormatException;
import mate.academy.model.Movie;

public interface MovieService {
    Movie add(Movie movie) throws DataFormatException;

    Movie get(Long id);
}
