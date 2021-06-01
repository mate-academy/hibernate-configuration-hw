package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
                                (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movieMatrix = new Movie("Matrix", "It depicts a dystopian future in which "
                          + "humanity is unknowingly trapped inside a simulated reality, the Matrix...");
        Movie movieInTime = new Movie("In Time", "About a future where time is money "
                          + "and the wealthy can live forever...");
        movieService.add(movieMatrix);
        movieService.add(movieInTime);

        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
