package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);
        Movie terminator = new Movie();
        terminator.setTitle("Terminator");
        movieService.add(terminator);
        Movie blackWidow = new Movie();
        blackWidow.setTitle("Black Widow");
        blackWidow.setDescription("Garbage movie");
        movieService.add(blackWidow);

        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
