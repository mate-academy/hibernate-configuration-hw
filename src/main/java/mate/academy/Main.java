package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie1 = new Movie("Fast and Furious 9", "description example");
        Movie movie2 = new Movie("House of Dragons", "description example");

        movieService.add(movie1);
        movieService.add(movie2);

        System.out.println(movieService.get(1L));
    }
}
