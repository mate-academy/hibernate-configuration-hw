package mate.academy.dao;

import mate.academy.model.Movie;

public interface MovieDao {
    Movie save(Movie movie);

    Movie get(Long id);
}
