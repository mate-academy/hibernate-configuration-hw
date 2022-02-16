package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final String PATH_IMPLEMENTATION = "mate.academy";
    private static final Injector injector = Injector.getInstance(PATH_IMPLEMENTATION);

    public static void main(String[] args) {

        final MovieService movieService = (MovieService)
                injector.getInstance(MovieService.class);

        Movie movieOne = new Movie();
        movieOne.setTitle("King Kong");
        movieOne.setDescription("action");

        Movie movieTwo = new Movie();
        movieTwo.setTitle("Terminator");
        movieTwo.setDescription("romantic comedy");

        Movie movieThree = new Movie();
        movieThree.setTitle("Rino");
        movieThree.setDescription("historical drama");

        movieService.save(movieOne);
        movieService.save(movieTwo);
        movieService.save(movieThree);

        System.out.println(movieService.get(1L).toString());
    }
}
