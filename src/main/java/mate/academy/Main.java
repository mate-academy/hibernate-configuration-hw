package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie watchmenMovie = new Movie();

        watchmenMovie.setTitle("Time");
        watchmenMovie.setDescription("This is film about future where main currency was money");

        System.out.println(movieService.add(watchmenMovie));
        System.out.println(movieService.get(watchmenMovie.getId()));
    }
}
