package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate");

    public static void main(String[] args) {
        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);

        Movie lordOfTheRing1 = new Movie("Lord of the ring 1", "fantasy");
        movieService.add(lordOfTheRing1);

        System.out.printf(movieService.get(lordOfTheRing1.getId()).toString());
    }
}
