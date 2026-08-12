package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final String MAIN_PACKAGE_NAME = "mate.academy.dao";

    public static void main(String[] args) {
        Injector injector = Injector.getInstance(MAIN_PACKAGE_NAME);
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(new Movie("Terminator", "Old movie"));
        System.out.println(movieService.get(1L));
    }
}
