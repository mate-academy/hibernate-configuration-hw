package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService = (MovieService) injector
            .getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie("BEST", "The bets of the best movie");

        System.out.println("__________________________________________________________________");
        movieService.add(movie);
        Movie movieFromDB = movieService.get(1L);
        System.out.println("__________________________________________________________________");
        System.out.println(movieFromDB);
        System.out.println("__________________________________________________________________");
    }
}
