package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);
        Movie firstMovie = new Movie("A Knight's Tale", "comedy adventure");
        System.out.println("Add movie:");
        System.out.println(movieService.add(firstMovie) + System.lineSeparator());
        Movie secondMovie = new Movie("Psycho", "psychological horror");
        System.out.println("Add movie:");
        System.out.println(movieService.add(secondMovie) + System.lineSeparator());
        System.out.println("Get movie with id 2:");
        System.out.println(movieService.get(2L));
    }
}
