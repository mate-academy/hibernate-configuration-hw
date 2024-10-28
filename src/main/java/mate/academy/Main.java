package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector
            .getInstance("mate.academy");
    private static final Movie MOVIE = new Movie("Shrek", "Angry and green");
    private static final Movie MOVIE2 = new Movie("Shrek 2", "Angry and green");
    private static final Movie MOVIE3 = new Movie("Shrek 3", "Angry and green");
    private static final Movie MOVIE4 = new Movie("Shrek 4", "Angry and green");
    private static final Long LONG = 1L;

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(MOVIE);
        movieService.add(MOVIE2);
        movieService.add(MOVIE3);
        movieService.add(MOVIE4);
        movieService.get(LONG);
    }
}
