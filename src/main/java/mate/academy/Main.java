package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        final MovieService movieService = (MovieService) injector
                .getInstance(MovieService.class);

        Movie movieF9 = new Movie();
        movieF9.setTitle("Fast and Furious 9");
        movieF9.setDescription("Action. 2021");
        movieService.add(movieF9);

        Movie movieTerminator = new Movie();
        movieTerminator.setTitle("The Terminator");
        movieTerminator.setDescription("Action. 1984");
        movieService.add(movieTerminator);

        Movie movieFromDb = movieService.get(2L);
        System.out.println(movieFromDb);
    }
}
