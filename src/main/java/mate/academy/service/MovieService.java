package mate.academy.service;

import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;

@Inject
@Service
public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);
}
