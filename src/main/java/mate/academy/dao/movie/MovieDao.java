package mate.academy.dao.movie;

import mate.academy.model.Movie;

public interface MovieDao {
    Movie add(Movie movie);

    Movie get(Long id);
}
