package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie darkKnight = new Movie("Dark Knight", "Gotham's Dark Knight fight against Joker");
        movieService.add(darkKnight);
        System.out.println(movieService.get(darkKnight.getId()));
    }
}
