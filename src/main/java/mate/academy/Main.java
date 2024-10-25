package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector
            .getInstance("mate.academy");
    private static final Movie MOVIE = new Movie("Shrek", "Angry and green");
    private static final Long LONG = 1L;

    public static void main(String[] args) {
        final Injector injector = Injector
                .getInstance("mate.academy.lib");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(MOVIE);
        movieService.get(LONG);
    }
}
