package mate.academy;

import java.util.Optional;

public interface MovieService {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);
}
