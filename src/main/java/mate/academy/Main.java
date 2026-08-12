package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie m1 = new Movie("Thing", "Horror movie");
        Movie movie = movieService.add(m1);
        Movie movie1 = movieService.get(1L);
        System.out.println(movie1);
    }
}
