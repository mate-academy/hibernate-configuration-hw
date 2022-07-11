package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector =
            Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie hobbitMovie = new Movie("Hobbit", "Lord of the ring universe");
        System.out.println(movieService.add(hobbitMovie));
        System.out.println(movieService.get(hobbitMovie.getId()));
    }
}
