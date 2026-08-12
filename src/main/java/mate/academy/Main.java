package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie("Terminator 5","This movie should not exist");

        movieService.add(movie);

        System.out.println(movie);

        Movie movie2 = movieService.get(movie.getId());

        System.out.println(movie2);
    }
}
