package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService = (MovieService)
            injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie harryPotter = new Movie();
        harryPotter.setTitle("Harry Potter and the Goblet of Fire");
        harryPotter.setDescription("Fantasy film");
        movieService.add(harryPotter);
        System.out.println(harryPotter);
        System.out.println(movieService.get(harryPotter.getId()));
    }
}
