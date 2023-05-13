package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie terminator = new Movie("Terminator", "Robots are bad");
        Movie terminatorTwo = new Movie("Terminator 2", "Robot are still bad");
        movieService.add(terminatorTwo);
        movieService.add(terminator);
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
