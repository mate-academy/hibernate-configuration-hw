package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie1 = new Movie("Cars", "Nice cartoon about speaking cars");
        Movie movie2 = new Movie("Pulp fiction", "Cool film about gangsters");
        movieService.add(movie1);
        movieService.add(movie2);
        Movie movie = movieService.get(2L);
        System.out.println(movie);
    }
}
