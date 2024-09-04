package mate.academy;

import java.util.List;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService service = (MovieService) injector.getInstance(MovieService.class);
        List<Movie> movies = List.of(
                new Movie(null, "m1", "d1"),
                new Movie(null, "m2", "d2")
        );

        System.out.println("Adding movies...");
        movies.forEach(movie -> {
            Movie addedMovie = service.add(movie);
            System.out.println(addedMovie);
        });

        System.out.println("\nRetrieving movies...");
        movies.forEach(movie -> {
            Movie retrievedMovie = service.get(movie.getId());
            System.out.println(retrievedMovie);
        });
    }
}
