package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie1 = new Movie("Game of thrones", "");
        Movie movie2 = new Movie("Harry Potter", "");
        Movie movie3 = new Movie("The Lord of the Rings", "");

        movieService.add(movie1);
        movieService.add(movie2);
        movieService.add(movie3);
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
        System.out.println(movieService.get(3L));
    }
}
