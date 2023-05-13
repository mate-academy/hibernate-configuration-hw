package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("John Wick");
        movie.setDescription("An ex-hit-man comes out of retirement to track down the gangsters"
                + " that killed his dog and took his car.");
        movie = movieService.add(movie);
        System.out.println(movieService.get(movie.getId()));
    }
}
