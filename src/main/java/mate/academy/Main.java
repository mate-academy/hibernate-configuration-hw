package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie("Movie1", "description1");
        Movie movie2 = new Movie("Movie2", "description2");

        movieService.add(movie);
        movieService.add(movie2);

        movieService.get(movie.getId());
        movieService.get(movie2.getId());
        movieService.get(null);
    }
}
