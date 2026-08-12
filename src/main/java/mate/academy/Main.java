package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService = (MovieService)
            injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie("Harry Potter", "A movie about Harry Potter");
        movie = movieService.add(movie);
        System.out.println("Created movie: " + movie);
        Movie receivedMovie = movieService.get(movie.getId());
        System.out.println("Received movie: " + receivedMovie);
    }
}
