package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Master and Commander: The Far Side of the World.");
        movie.setDescription("Adventure, Drama, Action, War.");
        System.out.println(movieService.add(movie));
        System.out.println(movieService.get(1L));
    }
}
