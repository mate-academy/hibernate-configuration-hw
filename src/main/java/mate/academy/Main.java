package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR =
            Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) INJECTOR.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie terminator = new Movie("Terminator", "Robot human");
        Movie faf = new Movie("Fast and Furious", "Racing movie");

        Movie add1 = movieService.add(terminator);
        Movie add2 = movieService.add(faf);

        System.out.println(add1);
        System.out.println(add2);
        System.out.println();

        Movie get1 = movieService.get(1L);
        Movie get2 = movieService.get(2L);

        System.out.println(get1);
        System.out.println(get2);
    }
}
