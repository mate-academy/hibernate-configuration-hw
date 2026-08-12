package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static final String MAIN_PACKAGE_NAME = "mate.academy";
    private static final Injector injector =
            Injector.getInstance(MAIN_PACKAGE_NAME);

    public static void main(String[] args) {
        MovieService movieService = (MovieService) Injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Deadpool");
        movie.setDescription("Good comedy!");
        movieService.add(movie);

        Movie movieFromDb = movieService.get(1L);
        System.out.println(movieFromDb);
    }
}
