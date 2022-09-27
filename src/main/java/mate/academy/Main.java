package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        final MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("LOTR: The Return of the King");
        movie.setDescription("One of the best fantasy movies of all times");
        movieService.add(movie);
        Movie getMovie = movieService.get(1L);
        System.out.println(getMovie);
    }
}
