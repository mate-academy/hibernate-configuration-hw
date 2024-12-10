package mate.academy;

import java.util.List;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final Long MOVIE_ID = 3L;

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        List<Movie> movies = createSampleMovies();

        //Add movies to the database;
        for (Movie movie : movies) {
            movieService.add(movie);
        }

        //Find a movie by ID.
        Movie movieById = movieService.get(MOVIE_ID);
        System.out.println(movieById);
    }

    private static List<Movie> createSampleMovies() {
        return List.of(
                new Movie("Inception", "Dream heist thriller"),
                new Movie("The Shawshank Redemption", "Hope and freedom"),
                new Movie("The Godfather", "Crime family saga"),
                new Movie("The Dark Knight", "Hero versus villain"),
                new Movie("Pulp Fiction", "Crime and redemption")
        );
    }
}
