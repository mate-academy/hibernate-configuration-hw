package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie arcaneSeries = new Movie("League of Legends: Arcane", "Interesting story and visual");
        Movie add = movieService.add(arcaneSeries);
        Movie movie = movieService.get(1L);
    }
}
