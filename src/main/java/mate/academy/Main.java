package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector inject = Injector.getInstance("mate.academy");
    private static final MovieService movieService = (MovieService)
            inject.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie("Frozen 2", "broke your hart");
        movieService.add(movie);
        movieService.get(movie.getId());
    }
}
