package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final String MAIN_PACKAGE_NAME = "mate.academy";

    public static void main(String[] args) {
        Injector injector = Injector.getInstance(MAIN_PACKAGE_NAME);
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Titanic");
        movie.setDescription("Bla bla bla");
        System.out.println(movieService.add(movie));
        System.out.println(movieService.get(1L));
    }
}
