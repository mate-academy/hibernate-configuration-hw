package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.services.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movieUp = new Movie();
        movieUp.setTitle("Up");
        movieUp.setDescription("Awesome movie");

        movieService.add(movieUp);

        movieService.get(movieUp.getId());
    }
}
