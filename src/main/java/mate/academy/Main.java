package mate.academy;

import java.util.List;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        List<Movie> movies = List.of(
                new Movie("Avatar", "Watch when you are tired of everyday life."),
                new Movie("Frozen", "Watch if you're missing winter"),
                new Movie("The Hunger Games", "Watch if you consider your life hard")
        );

        // add a list of movies
        movies.stream()
                .map(movieService::add)
                .forEach(System.out::println);

        // find a movie by existent id
        Movie foundMovie = movieService.get(3L);
        System.out.println(foundMovie);
    }
}
