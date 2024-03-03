package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final String PACKAGE = "mate.academy";
    private static final Injector injector = Injector.getInstance(PACKAGE);

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("12311");
        movie.setDescription("11456");

        movieService.add(movie);
        Movie movie1 = movieService.get(1L);

        System.out.println(movie1);
    }
}
