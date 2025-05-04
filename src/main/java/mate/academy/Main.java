package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {

        final MovieService movieService
                = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();

        /* Add to DB */
        movie.setTitle("First");
        movieService.add(movie);

        /* Get from DB */
        movie = movieService.get(1L);
        System.out.println(movie);
    }
}
