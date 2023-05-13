package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie blockbuster = new Movie();
        blockbuster.setTitle("John Wick");
        blockbuster.setDescription("Action/Neo-noir");
        MovieService movieService = (MovieService)
                injector.getInstance(MovieService.class);
        movieService.add(blockbuster);
        movieService.get(1L);
    }
}
