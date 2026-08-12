package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final String MAIN_PACKAGE = "mate.academy";
    private static final Injector injector = Injector.getInstance(MAIN_PACKAGE);

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("first movie");
        movie.setDescription("first description");
        movieService.add(movie);

        movie.setTitle("second movie");
        movie.setDescription("second description");
        movieService.add(movie);

        System.out.println(movieService.get(1L));
    }
}
