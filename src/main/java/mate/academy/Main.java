package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie harryPotter = new Movie();

        harryPotter.setTitle("Harry Potter");
        harryPotter.setDescription("The boy who lived");

        movieService.add(harryPotter);

        System.out.println(movieService.get(1L));
    }
}
