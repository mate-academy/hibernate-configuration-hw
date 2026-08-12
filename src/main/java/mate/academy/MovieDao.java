package mate.academy;

import java.util.Optional;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);
}
