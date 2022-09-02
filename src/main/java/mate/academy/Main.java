package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie terminator = new Movie();
        terminator.setTitle("Terminator");
        movieService.add(terminator);
        System.out.println(terminator);
        System.out.println(movieService.get(terminator.getId()));

        Movie terminator2 = new Movie();
        terminator2.setTitle("Terminator 2");
        movieService.add(terminator2);
        System.out.println(terminator2);
        System.out.println(movieService.get(terminator2.getId()));
    }
}
