package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import java.util.List;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);

        List<Movie> movies = initializeMovies();
        movies.forEach(movieService::add);

        for (int i = movies.size(); i > 0; i--) {
            movieService.get((long) i);
        }
    }

    private static List<Movie> initializeMovies() {
        return List.of(
                new Movie("ACADEMY DINOSAUR",
                        "A Epic Drama of a Feminist And a Mad Scientist " +
                                "who must Battle a Teacher in The Canadian Rockies"),
                new Movie("ARIZONA BANG",
                        "A Brilliant Panorama of a Mad Scientist And a Mad Cow " +
                                "who must Meet a Pioneer in A Monastery"),
                new Movie("CLONES PINOCCHIO",
                        "A Amazing Drama of a Car And a Robot " +
                                "who must Pursue a Dentist in New Orleans")
        );
    }
}
