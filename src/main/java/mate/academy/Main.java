package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie homeAlone = new Movie("Home Alone", "Christmas movie");
        movieService.add(homeAlone);
        movieService.get(homeAlone.getId());
        movieService.get(95L);
    }
}
