package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR =
            Injector.getInstance("mate.academy");
    private static final MovieService MOVIE_SERVICE =
            (MovieService) INJECTOR.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie("Lord of the ring", "great movie");
        System.out.println("Method add was called: " + MOVIE_SERVICE.add(movie));
        System.out.println("Method get was called: " + MOVIE_SERVICE.get(movie.getId()));
    }
}
