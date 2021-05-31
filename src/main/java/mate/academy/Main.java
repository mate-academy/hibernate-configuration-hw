package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie terminator = new Movie("terminator", "Awesome terminator!");
        Movie shrek = new Movie("Shrek 1", "Shrek is love!");
        System.out.printf("...Insert movies into DB...\n");
        movieService.add(terminator);
        movieService.add(shrek);
        System.out.printf("...Read movie from DB...\n");
        System.out.printf("%s", movieService.get(shrek.getId()));
    }
}
