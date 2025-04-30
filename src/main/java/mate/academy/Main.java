
package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.models.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final String MAIN_PACKAGE_NAME = "mate.academy";
    private static final Injector injector;
    private static final MovieService movieService;

    static {
        injector = Injector.getInstance(MAIN_PACKAGE_NAME);
        movieService = (MovieService) injector.getInstance(MovieService.class);
    }

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("test title");
        movie.setDescription("test description");
        Movie add = movieService.add(movie);
        System.out.println(add);
        Movie movie1 = movieService.get(1L);
        System.out.println(movie1);
    }
}
