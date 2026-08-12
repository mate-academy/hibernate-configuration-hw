package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        var movieService = (MovieService) injector.getInstance(MovieService.class);
        var movie = new Movie("SelfieParty","Ukrainian comedy film");

        Movie addedMovie = movieService.add(movie);
        System.out.println("addedMovie = " + addedMovie);

        Movie storedMovie = movieService.get(movie.getId());
        System.out.println("storedMovie = " + storedMovie);
    }
}
