package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        final MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);
        movieService.add(new Movie("Test movie", "Test description"));
        System.out.println("\n" + movieService.get(1L));
    }
}
