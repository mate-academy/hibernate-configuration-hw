package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector =
            Injector.getInstance("mate");
    private static MovieService movieService = (MovieService)
            injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie("Lord of the ring", "great movie");

        System.out.println("Method add was called: " + movieService.add(movie));
        System.out.println("Method get was called: " + movieService.get(movie.getId()));

    }
}
