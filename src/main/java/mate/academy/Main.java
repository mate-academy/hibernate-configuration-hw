package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        // movie instance
        Movie movie = new Movie();
        movie.setTitle("Ninja turtles 3");
        movie.setDescription("cartoon");
        // service add
        movieService.add(movie);
        // service get
        System.out.println(movieService.get(1L));
    }
}
