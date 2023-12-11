package mate.academy;

import mate.academy.lib.Inject;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    @Inject
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");
    private static MovieService movieService = (MovieService)
            INJECTOR.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie("MOVIE");
        movieService.add(movie);
        movieService.get(movie.getId());
    }
}
