package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector instance = Injector.getInstance("mate.academy");
    private static final MovieService movieService
            = (MovieService) instance.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("King Kong");
        movie.setDescription("Action");
        movieService.add(movie);
        movieService.get(1L);
    }
}
