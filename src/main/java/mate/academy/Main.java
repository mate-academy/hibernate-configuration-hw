package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie1 = new Movie("qwerty", "12345678");
        Movie movie2 = new Movie("ytrewq", "87654321");

        movieService.add(movie1);
        movieService.add(movie2);

        System.out.println(movieService.get(movie2.getId()));
    }
}
