package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService = (MovieService) injector
            .getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie bestMovie = new Movie("BEST", "The bets of the best movie");
        Movie goodMovie = new Movie("GOOD", "Good movie");

        System.out.println("__________________________________________________________________");
        movieService.add(bestMovie);
        movieService.add(goodMovie);

        Movie bestMovieFromDB = movieService.get(1L);
        Movie goodMovieFromDB = movieService.get(goodMovie.getId());

        System.out.println("__________________________________________________________________");

        System.out.println(bestMovieFromDB);
        System.out.println(goodMovieFromDB);

        System.out.println("__________________________________________________________________");
    }
}
