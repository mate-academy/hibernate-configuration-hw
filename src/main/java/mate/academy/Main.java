package mate.academy;

import mate.academy.model.Movie;
import mate.academy.lib.Injector;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie lordOfTheRings = new Movie("The Lord of the Rings", "Famous fantasy trilogy.");
        Movie benHur = new Movie("Ben Hur", "Historical movie about period of Ancient Rome.");
        movieService.save(lordOfTheRings);
        movieService.save(benHur);
        System.out.println("Show movie from DB " + movieService.get(lordOfTheRings.getId()));
        System.out.println("Show movie from DB " + movieService.get(benHur.getId()));
    }
}
