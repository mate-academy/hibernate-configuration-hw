package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movieShrek = new Movie();
        movieShrek.setTitle("Shrek");
        movieShrek.setDescription("Best cartoon ever");
        movieService.add(movieShrek);

        Movie movieAvengers = new Movie();
        movieAvengers.setTitle("Avengers");
        movieAvengers.setDescription("Heroes cooperation");
        movieService.add(movieAvengers);

        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
