package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie jewelOfTheNile = new Movie("Jewel of the Nile",
                "American action-adventure romantic comedy");
        Movie theGodsMustBeCrazy = new Movie("The Gods Must Be Crazy",
                "A comic allegory about a traveling Bushman");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(jewelOfTheNile);
        movieService.add(theGodsMustBeCrazy);

        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
        System.out.println(movieService.get(3L));
    }
}
