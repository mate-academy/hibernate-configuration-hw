package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie("Harry Potter", "Nice film");
        Movie movie1 = new Movie("Drive", "Ryan Gosling");

        Movie add = movieService.add(movie);
        System.out.println(add);

        Movie add1 = movieService.add(movie1);
        System.out.println(add1);

        movieService.add(null);

        Movie movie2 = movieService.get(2L);
        System.out.println(movie2);

        Movie movie3 = movieService.get(3L);
        System.out.println(movie3);
    }
}
