package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie("Terminator 10", "new history of GPT uprising!");
        Movie expected = movieService.add(movie);
        Movie actual = movieService.get(expected.getId());
        System.out.println("expected: " + expected);
        System.out.println("actual  : " + actual);
        System.out.println(expected.equals(actual) ? "Test successful!" : "Test fall!");
    }
}
