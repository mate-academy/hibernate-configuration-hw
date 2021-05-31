package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector =
            Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie joker = new Movie();
        joker.setTitle("Joker");
        joker.setDescription("Great movie");

        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);
        System.out.println(movieService.add(joker));
        System.out.println(movieService.get(1L));
    }
}
