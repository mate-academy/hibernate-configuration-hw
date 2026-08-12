package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final String PACKAGE = "mate.academy";

    public static void main(String[] args) {
        Injector injector = Injector.getInstance(PACKAGE);
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Matrix");
        movie.setDescription("The matrix has you");
        movieService.add(movie);
        System.out.println(movieService.get(1L));
    }
}
