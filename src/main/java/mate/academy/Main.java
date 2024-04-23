package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService;
        movieService = (MovieService)injector
                .getInstance(MovieService.class);
        Movie firstMovie = new Movie();
        firstMovie.setTitle("LA LA LAND");
        firstMovie.setDescription("Romantic movie");

        movieService.add(firstMovie);

        movieService.get(1L);
    }
}
