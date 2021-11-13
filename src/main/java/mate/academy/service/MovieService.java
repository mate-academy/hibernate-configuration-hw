package mate.academy.service;

import java.util.Optional;
import mate.academy.model.Movie;

public interface MovieService extends GenericService<Movie> {

    Movie save(Movie element);

    Movie get(Long id);
}
