package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector instance = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        System.out.println("Add movie to DB:");
        MovieService movieService = (MovieService) instance.getInstance(MovieService.class);
        Movie movie = new Movie("The Godfather", "Gangsters ...");
        movieService.add(movie);
        movie = new Movie("Inception", "Dream-sharing technology ...");
        movieService.add(movie);
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
        System.out.println(movieService.get(3L));
    }
}
