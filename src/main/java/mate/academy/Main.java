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
                new Movie("Shrek", "Somebody once told me the world is gonna"),
                new Movie("The Godfather", "You asking me without respect"),
                new Movie("The Lord of the Rings", "Many rings here")
        );

        movies.stream()
                .map(movieService::add)
                .forEach(System.out::println);

        Movie foundMovie = movieService.get(1L);
        System.out.println(foundMovie);
    }
}
