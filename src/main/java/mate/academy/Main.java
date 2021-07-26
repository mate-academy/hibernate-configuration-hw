package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static MovieService movieService
            = (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie terminator = new Movie();
        terminator.setTitle("Terminator");
        terminator.setDescription("First terminator movie");

        Movie secondTerminator = new Movie();
        secondTerminator.setTitle("Terminator 2");
        secondTerminator.setDescription("Second terminator movie");

        movieService.add(terminator);
        movieService.add(secondTerminator);

        System.out.println(movieService.get(terminator.getId()));
        System.out.println(movieService.get(secondTerminator.getId()));
    }
}
