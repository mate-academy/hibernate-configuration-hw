package mate.academy.service;

import mate.academy.entity.Movie;
import mate.academy.lib.Service;

@Service
public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);
}
